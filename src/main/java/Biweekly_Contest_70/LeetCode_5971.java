package Biweekly_Contest_70;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode_5971 {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{6,5,7,9,2,2}));
    }

    public static int minimumCost(int[] cost) {
        Integer[] costArr = Arrays.stream(cost).boxed().toArray(Integer[]::new);
        Arrays.sort(costArr, Collections.reverseOrder());
        int sum = 0;
        for (int i = 1; i <= costArr.length; i++) {
            if (i % 3 == 0)
                continue;
            else {
                sum += costArr[i - 1];
            }
        }
        return sum;
    }
}
