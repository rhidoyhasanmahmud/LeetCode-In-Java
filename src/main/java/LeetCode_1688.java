public class LeetCode_1688 {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(3));
    }

    public static int numberOfMatches(int n) {

        int team = n;
        Boolean isIterator = true;
        int sum = 0;
        while (isIterator) {
            int match = team / 2;
            team = team % 2 == 0 ? (team / 2) : (team / 2) + 1;
            sum += match;
            if (match < 1)
                isIterator = false;
        }
        return sum;
    }
}