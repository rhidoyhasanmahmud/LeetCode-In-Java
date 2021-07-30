public class LeetCode_007 {
    public static void main(String[] args) {
        System.out.println(reverse(-964632431));
    }

    public static int reverse(int x) {
        String reverseNumber = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return x < 0 ? Integer.parseInt(reverseNumber) * -1 : Integer.parseInt(reverseNumber);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverseV2(int x) {
        int reverse = 0;
        int lastDigits;

        while (x != 0) {
            lastDigits = x % 10;
            reverse = (reverse * 10) + lastDigits;
            x = x / 10;
        }
        return reverse;
    }

    public static int reverseV1(int x) {
        StringBuilder reverseNumber = new StringBuilder(x > 0 ? "" : "-");
        x = Math.abs(x);
        while (x != 0) {
            int result = x / 10;
            int reminder = x % 10;
            reverseNumber.append(reminder);
            x = result;
        }
        return Integer.parseInt(reverseNumber.toString());
    }
}
