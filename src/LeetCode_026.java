import java.util.HashSet;
import java.util.Set;

public class LeetCode_026 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length > 0) {
            int uniqueDuplicateIndex = 0;
            for (int index = 0; index < nums.length - 1; index++) {
                if (nums[index] != nums[index + 1]) {
                    nums[uniqueDuplicateIndex++] = nums[index];
                }
            }
            nums[uniqueDuplicateIndex++] = nums[nums.length - 1];
            return uniqueDuplicateIndex;
        } else {
            return 0;
        }
    }
}
