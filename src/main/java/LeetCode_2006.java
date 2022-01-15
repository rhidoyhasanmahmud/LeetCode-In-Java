public class LeetCode_2006 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference(nums, k));
    }

    public static int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j) {
                    if (Math.abs(nums[i] - nums[j]) == k) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
