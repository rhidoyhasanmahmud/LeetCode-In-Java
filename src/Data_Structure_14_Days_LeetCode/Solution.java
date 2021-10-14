package Data_Structure_14_Days_LeetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsHashSet = new HashSet<Integer>();
        for (int num : nums) {
            if (!numsHashSet.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate_TLE(int[] nums) {
        int sizeOfNums = nums.length;
        for (int indexOne = 0; indexOne < sizeOfNums; indexOne++) {
            for (int indexTwo = 0; indexTwo < sizeOfNums; indexTwo++) {
                if (indexOne != indexTwo) {
                    if (nums[indexOne] == nums[indexTwo]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
