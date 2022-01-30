public class LeetCode_1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    public static String replaceDigits(String s) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char newCh = s.charAt(i);
            if (!Character.isDigit(newCh)) {
                stringBuilder.append(newCh);
            } else {
                char ch = s.charAt(i - 1);
                int digit = Character.getNumericValue(s.charAt(i));
                int new_ch = (int) ch + digit;
                stringBuilder.append((char) new_ch);
            }
        }
        return stringBuilder.toString();
    }
}
