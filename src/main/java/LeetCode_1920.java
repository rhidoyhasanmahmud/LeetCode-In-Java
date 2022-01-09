public class LeetCode_1920 {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{5,0,1,2,3,4}));
    }

    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len];

        for (int i = 0; i < len; i++){
            int num = nums[i];
            int replaceNum = nums[num];
            newArr[i] = replaceNum;
        }
        return newArr;
    }
}
