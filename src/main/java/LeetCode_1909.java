import java.util.Arrays;

public class LeetCode_1909 {
    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[]{1, 2, 2, 4}));
    }

    public static boolean canBeIncreasing(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (!(nums[i] < nums[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
