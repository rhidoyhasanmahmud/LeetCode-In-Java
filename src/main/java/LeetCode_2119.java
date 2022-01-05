public class LeetCode_2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(609576));
    }

    public static boolean isSameAfterReversals(int num) {
        boolean isIterator = true;
        int reverserNumber = 0;
        int backupNumber = num;
        while (isIterator) {
            int reminder = num % 10;
            num = num / 10;
            reverserNumber = reverserNumber * 10 + reminder;
            if (num == 0) {
                break;
            }
        }
        return String.valueOf(reverserNumber).length()==(String.valueOf(backupNumber).length());
    }
}
