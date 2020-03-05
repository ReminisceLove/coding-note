/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *   L   C   I   R
 *   E T O E S I I G
 *   E   D   H   N
 */
public class LC_0006_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            if (i == 1 || i == numRows) {
                for (int j = i-1; j < s.length(); j += 2 * (numRows - 1)) {
                    stringBuilder.append(s.charAt(j));
                }
            } else {
                int tag = 0;
                int j = i - 1;
                while (j < s.length()) {
                    stringBuilder.append(s.charAt(j));
                    if (tag % 2 == 0) {
                        tag++;
                        j += 2 * (numRows - i);
                    } else {
                        tag++;
                        j += 2 * (i - 1);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
