import java.util.Arrays;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 */

public class LC_0031_NextPermutation {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int minTmp = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < nums[minTmp] && nums[j] > nums[i - 1]) {
                        minTmp = j;
                    }
                }
                int temp = nums[minTmp];
                nums[minTmp] = nums[i - 1];
                nums[i - 1] = temp;
                Arrays.sort(nums, i, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
}
