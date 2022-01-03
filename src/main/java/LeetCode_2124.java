public class LeetCode_2124 {
    public static void main(String[] args) {
        System.out.println(checkString("abaabbb"));
    }

    public static boolean checkString(String s) {

        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index-1) == 'b' && s.charAt(index) == 'a') {
                return false;
            }
        }
        return true;
    }
}
