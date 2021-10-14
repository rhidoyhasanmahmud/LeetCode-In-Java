public class LeetCode_1672 {
    public static void main(String[] args) {
        int distances[][] = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(distances));
    }

    public static int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        int len = accounts.length;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            int yDimensionLen = accounts[i].length;
            for (int j = 0; j < yDimensionLen; j++) {
                sum += accounts[i][j];
            }
            if (sum > richestWealth) {
                richestWealth = sum;
            }
        }
        return richestWealth;
    }
}
