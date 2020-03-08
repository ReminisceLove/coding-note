import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */

public class LC_0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return ans;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int curr = nums[i];
            int left = i + 1, right = len - 1;
            while (left < right) {
                int tmp = curr + nums[left] + nums[right];
                if (tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (tmp < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
