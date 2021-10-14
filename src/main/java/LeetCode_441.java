public class LeetCode_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    /*
           5
           1 - 4 ->
           2 - 2
           2
    */
    public static int arrangeCoins(int n) {
        int index = 0;

        for (int i = 0; ; i++) {
            if (n < (i + 1)) {
                index = i;
                break;
            } else {
                n -= (i + 1);
            }
        }
        return index;
    }
}
