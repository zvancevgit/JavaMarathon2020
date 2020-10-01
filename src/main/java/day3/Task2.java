package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        double b;

        do {
            a = scan.nextDouble();
            b = scan.nextDouble();

            if (b == 0) {
                break;
            } else {
                System.out.println(a / b);
            }
        } while (b != 0);
    }
}