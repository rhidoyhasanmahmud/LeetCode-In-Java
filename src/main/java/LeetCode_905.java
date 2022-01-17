import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_905 {
    public static void main(String[] args) {

    }


    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0)
                evenNum.add(num);
            else
                oddNum.add(num);
        }
        Collections.sort(evenNum);
        Collections.sort(oddNum);

        int index = 0;
        for (Integer num : evenNum) nums[index++] = num;
        for (Integer num : oddNum) nums[index++] = num;

        return nums;
    }
}
