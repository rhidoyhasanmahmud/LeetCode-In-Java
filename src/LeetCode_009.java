public class LeetCode_009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String reverseNumber = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            int reverseInt = Integer.parseInt(reverseNumber);
            System.out.println(x);
            System.out.println(reverseInt);
            return reverseInt == x;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
