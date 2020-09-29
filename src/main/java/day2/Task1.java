package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();

        if (f <= 4 && f > 0) {
            System.out.println("Малоэтажный дом");
        } else if (f >= 5 && f <= 8){
            System.out.println("Среднеэтажный дом");
        } else if (f >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}