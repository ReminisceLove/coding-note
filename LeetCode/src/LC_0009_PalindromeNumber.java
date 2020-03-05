/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class LC_0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }
        int ans = 0;
        int temp = x;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans == temp;
    }
}
