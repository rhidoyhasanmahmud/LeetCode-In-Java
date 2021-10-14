public class LeetCode_027 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 5, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int distinctCount = 0;
        for (int num : nums) {
            if (num != val) {
                nums[distinctCount++] = num;
            }
        }

        return distinctCount;
    }
}
