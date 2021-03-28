import java.util.Arrays;

public class LeetCode_1470 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(Arrays.toString(shuffle(nums, 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] newNums = new int[len];
        int halfLen = len / 2;
        int index = 0;
        for (int i = 0; i < len / 2; i++) {
            newNums[index++] = nums[i];
            newNums[index++] = nums[halfLen + i];
        }
        return newNums;
    }
}
