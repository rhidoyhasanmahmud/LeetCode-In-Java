public class LeetCode_35 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
            mid = (start + end) / 2;

        }
        return start;
    }
}
