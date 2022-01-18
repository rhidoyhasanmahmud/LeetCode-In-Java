public class LeetCode_1385 {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int totalNotMatchCodition = 0;
        boolean isConditionNotMatch = false;

        for (int j : arr1) {
            for (int k : arr2) {
                if ((Math.abs(j - k)) > d) {
                    isConditionNotMatch = true;
                } else {
                    isConditionNotMatch = false;
                    break;
                }
            }
            if (isConditionNotMatch) {
                totalNotMatchCodition++;
            }
        }
        return totalNotMatchCodition;
    }
}
