import java.sql.Array;

public class LeetCode_001 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(twoSum(arr, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int sizeOfNums = nums.length;
        for (int i = 0; i < sizeOfNums; i++) {
            for (int j = 0; j < sizeOfNums; j++) {
                if (i == j)
                    continue;
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};

            }
        }
        return new int[0];
    }
}

