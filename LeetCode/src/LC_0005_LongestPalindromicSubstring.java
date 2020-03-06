/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */

public class LC_0005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String ans = "";
        int start;
        int end;
        // 奇数个回文
        for (int i = 1; i < s.length(); i++) {
            start = end =  i;
            while (start >= 0 && end < s.length()) {
                if (s.charAt(start) == s.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }
            if (end - start - 1 > ans.length()) {
                ans = s.substring(start + 1, end);
            }
        }
        // 偶数个回文
        for (int i = 0; i < s.length() - 1; i++) {
            start = i;
            end = i + 1;
            while (start >= 0 && end < s.length()) {
                if (s.charAt(start) == s.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }
            if (end - start - 1 > ans.length()) {
                ans = s.substring(start + 1, end);
            }
        }
        return ans;
    }
}
