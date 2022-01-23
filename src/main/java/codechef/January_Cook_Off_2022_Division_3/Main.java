package codechef.January_Cook_Off_2022_Division_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        for (int i = 0; i < T; i++) {
            int a = inp.nextInt();
            if (a < 2)
                System.out.println();
            else {
                int mid = a / 2;
                int start = a - mid;
                String out = "";
                for (int ii = 0; ii < start; ii++)
                    out += "a";
                for (int iii = 0; iii < mid; iii++)
                    out += "z";
                System.out.println(out);
            }
        }
    }
}
