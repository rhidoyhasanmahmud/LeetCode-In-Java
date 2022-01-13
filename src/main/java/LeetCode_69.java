public class LeetCode_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        Double sqrt = Math.sqrt(x);
        String[] num = sqrt.toString().split("\\.");
        return Integer.parseInt(num[0]);
    }
}
