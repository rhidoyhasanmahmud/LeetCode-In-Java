import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1431 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        System.out.println(kidsWithCandies(candies, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> boolArr = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                boolArr.add(true);
            } else {
                boolArr.add(false);
            }
        }
        return  boolArr;
    }
}
