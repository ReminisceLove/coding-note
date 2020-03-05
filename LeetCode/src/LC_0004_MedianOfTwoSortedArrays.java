import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 */
public class LC_0004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double medianNum = 0;
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++, index++)
            nums[index] = nums1[i];
        for (int j = 0; j < nums2.length; j++, index++)
            nums[index] = nums2[j];
        Arrays.sort(nums);
        if (nums.length % 2 == 1)
            medianNum = nums[nums.length / 2];
        else
            medianNum = (((double)nums[nums.length / 2] + (double)nums[nums.length / 2 - 1]) / 2);
        return medianNum;
    }
}
