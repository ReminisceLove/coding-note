/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LC_0003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = leftIndex; j < i; j++) {
                if (chars[j] == chars[i]) {
                    maxLength = Math.max(maxLength, i - leftIndex);
                    leftIndex = j + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }
}
