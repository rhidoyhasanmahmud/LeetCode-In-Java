package codechef.January_Cook_Off_2022_Division_3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        for (int i = 0; i < T; i++) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            int c = inp.nextInt();
            if (b <= a) {
                System.out.println("PIZZA");
            } else if (c <= a) {
                System.out.println("BURGER");
            } else {
                System.out.println("NOTHING");
            }
        }
    }
}
