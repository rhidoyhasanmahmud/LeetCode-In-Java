import java.util.HashSet;
import java.util.Set;

public class LeetCode_1684 {
    public static void main(String[] args) {
        String[] arr = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad", arr));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for (String word : words) {
            if (removeDuplicates(word, allowed))
                cnt++;
        }
        return cnt;
    }

    static boolean removeDuplicates(String word1, String word2) {
        StringBuilder s = new StringBuilder();

        Set<Character> set = new HashSet<>();
        for (char c : word2.toCharArray())
            set.add(c); //add all second string character to set
        for (char c : word1.toCharArray()) {
            if (!set.contains(c)) //check if the character is not one of the character of second string
                s.append(c); //append the current character to the pool
        }
        return s.length() == 0;
    }
}
