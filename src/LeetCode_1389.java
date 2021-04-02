import java.util.ArrayList;
import java.util.List;

public class LeetCode_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int indexLen = index.length;
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < indexLen; i++) {
            newArr.add(index[i], nums[i]);
        }
        return newArr.stream().mapToInt(i -> i).toArray();
    }
}
