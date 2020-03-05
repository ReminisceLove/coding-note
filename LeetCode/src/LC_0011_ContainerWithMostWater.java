/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */

public class LC_0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
//        int ans = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                ans = Math.max(ans, (j - i) * Math.min(height[i], height[j]));
//            }
//        }
//        return ans;
        int ans = 0, i = 0, r = height.length - 1;
        while (i < r) {
            ans = Math.max(ans, Math.min(height[i], height[r]) * (r - i));
            if (height[i] < height[r]) {
                i++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
