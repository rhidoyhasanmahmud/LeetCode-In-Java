public class LeetCode_1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] countSmaller = new int[len];

        for (int i = 0; i <len; i++){
            countSmaller[i] = 0;
            for(int j = 0; j<len; j++){
                if(i==j)
                    continue;
                else {
                    if(nums[i] > nums[j]){
                        countSmaller[i]++;
                    }
                }
            }
        }
        return countSmaller;
    }
}
