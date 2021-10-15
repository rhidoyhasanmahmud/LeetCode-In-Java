import java.util.HashSet;

public class LeetCode_217 {
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
