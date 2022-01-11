public class LeetCode_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int value(char ch) {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return -1;
    }

    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            int s2;
            if (i != s.length() - 1) {
                s2 = value(s.charAt(i + 1));
                if (s2 > s1) {
                    total += (-s1);
                } else {
                    total += (s1);

                }
            } else {
                total += s1;
            }
        }
        return total;
    }
}