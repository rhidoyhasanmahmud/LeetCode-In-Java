public class LeetCode_121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            buy = Math.min(buy, price);
            profit = Math.max(profit, (price - buy));
            System.out.println(buy + " " + profit);
        }
        return profit;
    }
}
