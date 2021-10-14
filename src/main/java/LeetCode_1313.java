import java.util.Arrays;

public class LeetCode_1313 {
    public static void main(String[] args) {
        int[] arr = {1,9,1,9};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        int len_of_num = nums.length;
        for (int i = 0; i < len_of_num; i += 2) {
            len += nums[i];
        }
        int[] newArr = new int[len];
        int index = 0;
        int maxNum = 0;
        for (int i = 0; i < len_of_num; i++) {
            if (i % 2 == 0) {
                maxNum = nums[i];
            } else {
                int tmp = nums[i];
                for (int j = 0; j < maxNum; j++) {
                     newArr[index] = tmp;
                     index++;
                }
            }
        }
        return newArr;
    }
}

