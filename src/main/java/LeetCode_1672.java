public class LeetCode_1672 {
    public static void main(String[] args) {
        int distances[][] = {
                {2, 8, 7}, {7, 1, 3}, {1, 9, 5}
        };
        System.out.println(maximumWealth(distances));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int len = accounts.length;
        for (int i = 0; i < len; i++) {
            int totalSum = 0;
            int innerLen = accounts[i].length;
            for (int j = 0; j < innerLen; j++) {
                totalSum += accounts[i][j];
            }
            sum = Math.max(sum, totalSum);
        }
        return sum;
    }
}
