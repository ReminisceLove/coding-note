/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */

public class LC_0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        boolean flag = true;
//        StringBuilder ans = new StringBuilder();
//        int count = 0;
//        if (strs.length == 0) {
//            return "";
//        } else if (strs.length == 1) {
//            return strs[0];
//        }
//        while (flag) {
//            char x;
//            if (count < strs[0].length()) {
//                x = strs[0].charAt(count);
//                ans.append(x);
//            } else {
//                flag = false;
//                continue;
//            }
//            for (int i = 1; i < strs.length; i++) {
//                if (count < strs[i].length()) {
//                    if (x != strs[i].charAt(count)) {
//                        flag = false;
//                        ans.deleteCharAt(count);
//                        break;
//                    }
//                } else {
//                    flag = false;
//                    ans.deleteCharAt(count);
//                    break;
//                }
//            }
//            count++;
//        }
//        return ans.toString();
        if (strs == null || strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (String str : strs) {
            while (!str.startsWith(ans)) {
                if (ans.length() == 1) {
                    return "";
                }
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }
}
