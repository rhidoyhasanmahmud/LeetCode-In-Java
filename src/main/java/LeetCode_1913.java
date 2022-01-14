import java.util.Arrays;

public class LeetCode_1913 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int w = nums[0];
        int x = nums[1];
        int y = nums[nums.length - 1];
        int z = nums[nums.length - 2];
        return (y * z) - (w * x);
    }
}
