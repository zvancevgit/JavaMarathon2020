package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a < b) {
            int t = a;
            if (a % 5 == 0 & a % 10 != 0) {
                System.out.print(t + " ");
            }
            a++;
        }
    }
}
