public class LeetCode_771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int countTotal = 0;

        for (char jw : jewels.toCharArray()) {
            for (char ch : stones.toCharArray()) {
                if (ch == jw) {
                    countTotal++;
                }
            }
        }
        return countTotal;
    }
}
