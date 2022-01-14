public class LeetCode_1720 {
    public static void main(String[] args) {
        System.out.println(decode(new int[]{6,2,7,3}, 4));
        /*
        [1,2,3]

        1-0-2-1
         */
    }

    public static int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len + 1];
        arr[0] = first;
        for (int i = 1; i < len+1; i++) {
            System.out.println("Arr-> " + arr[i - 1] + " encoded -> " + encoded[i - 1]);
            arr[i] = arr[i - 1] ^ encoded[i - 1];
            System.out.println(arr[i]);
        }
        return arr;
    }
}
