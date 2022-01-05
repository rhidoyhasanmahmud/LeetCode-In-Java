public class LeetCode_1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] doubleNumberArray = new int[nums.length * 2];
        for (int index = 0; index < nums.length; index++) {
            doubleNumberArray[index] = nums[index];
        }
        int initIndex = nums.length;
        for (int index = 0; index < nums.length; index++) {
            doubleNumberArray[initIndex++] = nums[index];
        }
        return doubleNumberArray;
    }
}
