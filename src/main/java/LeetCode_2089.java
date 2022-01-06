import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_2089 {
    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 3));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indexNumbersOfTargetNumber = new ArrayList<>();
        Arrays.sort(nums);

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                indexNumbersOfTargetNumber.add(index);
            }
        }
        return indexNumbersOfTargetNumber;
    }
}
