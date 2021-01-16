package forCicleEX;

import java.util.Scanner;

public class DivideWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int p1Sum = 0;
        int p2Sum = 0;
        int p3Sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                p1Sum = p1Sum + 1;
            }
            if (number % 3 == 0) {
                p2Sum = p2Sum + 1;
            }
            if (number % 4 == 0) {
                p3Sum = p3Sum + 1;
            }
        }

        System.out.printf("%.2f%%%n", p1Sum * 100.0/ n);
        System.out.printf("%.2f%%%n", p2Sum * 100.0/ n);
        System.out.printf("%.2f%%%n", p3Sum * 100.0/ n);
    }
}
