public class LeetCode_58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World   "));
    }
    public static int lengthOfLastWord(String s) {
        String[] splitS = s.split(" ");
        int len = splitS.length;
        String finalStr = splitS[len-1];
        return finalStr.length();
    }
}
