package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            double a = scan.nextDouble();
            double b = scan.nextDouble();

            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }

            System.out.println(a / b);
        }
    }
}
