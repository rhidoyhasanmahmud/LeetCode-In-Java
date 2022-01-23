import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1200 {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minValueDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) < minValueDiff) {
                minValueDiff = Math.min(minValueDiff, Math.abs(arr[i + 1] - arr[i]));
            }
        }
        List<List<Integer>> outList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == minValueDiff) {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(arr[i]);
                indexList.add(arr[i + 1]);
                outList.add(indexList);
            }
        }
        return outList;
    }
}
