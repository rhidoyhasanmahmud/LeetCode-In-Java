import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 1, 2, 2, 3,3,5}));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 2)
            return nums[0];
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            if (i + 1 < len && nums[i] != nums[i + 1]) {
                return nums[i];
            }
            if (!(i + 1 < len)) {
                return nums[i];
            } else {
                i = i + 1;
            }
        }
        return 404;
    }

    public static int singleNumber_TLE(int[] nums) {
        int cnt = 0;
        Set<Integer> distictNumber = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (distictNumber.contains(num))
                    continue;
                if (i != j && nums[i] == num) {
                    cnt = 1;
                }
            }
            if (cnt == 0) {
                return nums[i];
            }
            cnt = 0;
        }
        return 0;
    }
}
