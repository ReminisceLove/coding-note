import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 */

public class LC_0032_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        List<Character> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int temp = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list.size() == 0) {
                list.add(s.charAt(i));
            } else {
                if (s.charAt(i) == '(') {
                    list.add(s.charAt(i));
                } else {
                    if (list.get(list.size() - 1) == '(') {
                        ans.get(temp)
                    }
                }
            }
        }
        return ans * 2;
    }
}
