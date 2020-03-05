/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */

public class LC_0028_ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        } else if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int length = 0;
            for (int j = i; j < haystack.length() && j - i < needle.length(); j++) {
                if (haystack.charAt(j) == needle.charAt(j - i)) {
                    length++;
                } else {
                    break;
                }
            }
            if (length == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
