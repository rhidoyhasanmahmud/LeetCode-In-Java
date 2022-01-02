public class LeetCode_1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] sortSentence = s.split(" ");
        String[] newSortSentence = new String[sortSentence.length];
        for (String word : sortSentence) {
            String lastSeqChar = word.substring(word.length() - 1);
            int lastSeqNum = Integer.parseInt(lastSeqChar);
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(sb.length() - 1);
            if (newSortSentence.length != lastSeqNum)
                sb.append(" ");
            newSortSentence[lastSeqNum - 1] = sb.toString();
        }
        String finalOutput = "";
        for (String word : newSortSentence) {
            finalOutput = finalOutput + word;
        }
        return finalOutput;
    }
}
