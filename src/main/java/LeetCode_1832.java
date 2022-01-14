public class LeetCode_1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("test"));
    }

    public static boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(ch + "")) {
                return false;
            }
        }
        return true;
    }
}
