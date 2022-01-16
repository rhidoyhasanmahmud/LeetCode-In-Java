import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_1051 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
    }

    public static int heightChecker(int[] heights) {
        int cnt = 0;
        int[] copyArr = heights.clone();
        Arrays.sort(copyArr);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i] + " " + heights[i]);
            if (copyArr[i] != heights[i])
                cnt++;
        }
        return cnt;
    }
}
