public class LeetCode_2114 {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWordNumberInSentence = 0;

        for (String sentence : sentences) {
            String[] wordArray = sentence.split(" ");
            int totalWordInWordArray = wordArray.length;
            if (maxWordNumberInSentence < totalWordInWordArray) {
                maxWordNumberInSentence = totalWordInWordArray;
            }
        }
        return maxWordNumberInSentence;
    }
}
