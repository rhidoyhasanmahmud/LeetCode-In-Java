package Data_Structure_14_Days_LeetCode;

public class LeetCode_53 {
    public static void main(String[] args) {
        int[] nums = {-2, -1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];

        for (int index = 1; index < length; index++) {
            dp[index] = nums[index] + (Math.max(dp[index - 1], 0));
            max = Math.max(max, dp[index]);
        }

        return max;
    }
}

/*
Kadane’s Algorithm::
------------------
Array ->

1. Traverse Array ->
maxEndingHere = maxEndingHere(0) + num
maxEndingHere = max(maxEndingHere , 0)
maxSoFar = max (maxSoFar, maxEndingHere)

2. Return -> maxSoFar
--------------------------------------
{-2, 1, -3}
--
Step - 1:
maxEndingHere = 0 + (-2) = -1;
maxEndingHere = Integer.max(-1, 0) = 0;
maxSoFar = Integer.max(0, 0) = 0;

Step - 2:

maxEndingHere = 0 + (1) = 1;
maxEndingHere = Integer.max(1, 0) = 1;
maxSoFar = Integer.max(0, 1) = 1;

Step - 3:

maxEndingHere = 1 + (-3) = -2;
maxEndingHere = Integer.max(-2, 0) = 0;
maxSoFar = Integer.max(0, 1) = 1;

return -> 1
 */
