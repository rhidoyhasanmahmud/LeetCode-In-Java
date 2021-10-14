public class LeetCode_1512 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int totalPairs = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i < j && nums[i] == nums[j])
                    totalPairs++;
            }
        }
        return totalPairs;
    }
}
