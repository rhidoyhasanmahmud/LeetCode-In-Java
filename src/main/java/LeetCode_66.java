public class LeetCode_66 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder digitsToNum = new StringBuilder();
        for (int digit : digits) {
            String strNum = String.valueOf(digit);
            digitsToNum.append(strNum);
        }
        Long digitsStrToInt = Long.parseLong(digitsToNum.toString()) + 1L;
        String digitsStr = String.valueOf(digitsStrToInt);
        int[]  newdigits = new int[digitsStr.length()];
        for (int i = 0; i < digits.length; i++) {
            char num = digitsStr.charAt(i);
            newdigits[i] = Integer.parseInt(String.valueOf(num));
        }
        return newdigits;
    }
}
