package forCicle;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double pricewash = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        double money = 10;
        double sum = 0;

        for (int i = 1; i <= years; i++) {

            if (i % 2 != 0) {
                toys += 1;
            }
            if (i % 2 == 0) {
              sum = sum + money -1;
              money = money + 10;
            }
        }
        sum = sum + toys * priceToy;

        if (sum >= pricewash) {
            System.out.printf("Yes! %.2f", sum - pricewash);
        } else {
            System.out.printf("No! %.2f", pricewash - sum);
        }
    }
}
