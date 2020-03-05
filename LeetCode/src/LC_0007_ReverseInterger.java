/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */

public class LC_0007_ReverseInterger {
    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return (int)ans == ans ? (int)ans : 0;
    }
}
