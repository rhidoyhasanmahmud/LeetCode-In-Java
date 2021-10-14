public class LeetCode_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        boolean isCondition = true;
        int totalStep = 0;
        while (isCondition) {
            if (num == 0) {
                isCondition = false;
            }
            else if (num % 2 == 0) {
                num = (num / 2);
                totalStep++;
            } else {
                num = (num - 1);
                totalStep++;
            }
        }
        return totalStep;
    }
}
