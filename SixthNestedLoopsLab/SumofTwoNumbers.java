package nestedLab;

import java.util.Scanner;

public class SumofTwoNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Първи ред – начало на интервала – цяло число в интервала [1...999]
//•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
//•	Трети ред – магическото число – цяло число в интервала [1...10000]

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countComb = 0;
        boolean flag = false;

        for (int x = start; x <= end; x++) {
            for (int y = start; y <= end; y++) {
                countComb++;
                if (x + y == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countComb, x, y, magicNumber);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }


        }
        if(!flag) {
            System.out.printf("%d combinations - neither equals %d", countComb, magicNumber);
        }
    }
}