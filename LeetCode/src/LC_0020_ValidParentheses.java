/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *   1.左括号必须用相同类型的右括号闭合。
 *   2.左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 */

public class LC_0020_ValidParentheses {
    public boolean isValid(String s) {
        char[] chars = new char[(s.length() + 1) / 2];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                if (count >= (s.length() + 1) / 2) {
                    return false;
                }
                chars[count++] = s.charAt(i);
            } else {
                if (count == 0) {
                    return false;
                }
                switch (s.charAt(i)) {
                    case ')' :
                        if (chars[--count] != '(') {
                            return false;
                        }
                        break;
                    case ']' :
                        if (chars[--count] != '[') {
                            return false;
                        }
                        break;
                    case '}' :
                        if (chars[--count] != '{') {
                            return false;
                        }
                        break;
                }
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }
}
