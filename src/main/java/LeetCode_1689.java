public class LeetCode_1689 {
    public static void main(String[] args) {
        System.out.println(minPartitions("27346209830709182346"));
    }

    public static int minPartitions(String n) {
        char[] charArray = n.toCharArray();
        int maxNumberInString = charArray[0] - '0';
        for (int i = 1; i < charArray.length; i++) {
            int num = (charArray[i] - '0');
            maxNumberInString = Math.max(num, maxNumberInString);
        }
        return maxNumberInString;
    }
}
