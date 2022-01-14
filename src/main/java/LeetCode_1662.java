public class LeetCode_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "cc"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder concateWord1 = new StringBuilder();
        StringBuilder concateWord2 = new StringBuilder();

        for (String word : word1) {
            concateWord1.append(word);
        }
        for (String word : word2) {
            concateWord2.append(word);
        }
        return concateWord1.toString().equals(concateWord2.toString());
    }
}
