import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1480 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateArray(new int[]{3,1,2,10,1})));
    }

    public static int[] calculateArray(int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len];
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0; j<=i; j++){
                newNums[i] += nums[j];
            }
        }
        return newNums;
    }
}