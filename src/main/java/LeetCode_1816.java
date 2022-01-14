public class LeetCode_1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("What is the solution to this problem", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder out = new StringBuilder();
        for (String word : words) {
            out.append(word);
            if (k == 1) {
                break;
            } else {
                out.append(" ");
                k--;
            }
        }
        return out.toString();
    }
}
