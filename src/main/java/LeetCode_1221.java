public class LeetCode_1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        int plusMinus = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'R') plusMinus++;
            if (c == 'L') plusMinus--;

            if (plusMinus == 0) count++;
        }
        return count;
    }
}
