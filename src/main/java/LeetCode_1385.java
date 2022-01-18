public class LeetCode_1385 {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int totalNotMatchCodition = 0;
        boolean isConditionNotMatch = false;

        for (int k = 0; k < arr1.length; k++) {
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr1[k] +" "+ arr2[i] + " " + d + " " + Math.abs(arr1[k] - arr2[i]));
                System.out.println(Math.abs(arr1[k] - arr2[i])<=d);
                if ((Math.abs(arr1[k] - arr2[i]) <= d)) {
                    System.out.println("OK");
                    isConditionNotMatch = true;
                } else {
                    isConditionNotMatch = false;
                    break;
                }

            }
            System.out.println("----------------");
            System.out.println(isConditionNotMatch);
            if (isConditionNotMatch) {
                totalNotMatchCodition++;
            }
        }
        return totalNotMatchCodition;
    }
}
