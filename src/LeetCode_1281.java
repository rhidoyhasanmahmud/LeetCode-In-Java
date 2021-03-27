/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

 */
public class LeetCode_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    /*
       123 -> 123/10 = 12 || 123 % 10 = 3
       12  -> 12/10  = 1  || 12  % 10 = 2
       1   -> 1/10   = 0  || 1   % 10 = 1
    */
    public static int subtractProductAndSum(int number) {
        int productNumber = 1;
        int sumNum = 0;
        int reminder = 0;
        boolean isCondition = true;
        while (isCondition) {
            reminder = number % 10;
            number = number / 10;
            productNumber *= reminder;
            sumNum += reminder;
            if (number == 0) {
                isCondition = false;
            }
        }
        return productNumber - sumNum;
    }

}
