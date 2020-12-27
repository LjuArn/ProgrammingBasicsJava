package whileCicleEx;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //•	Налични пари - реално число в интервала [0.00...25000.00]

        double neeedMoneyVacation = Double.parseDouble(scanner.nextLine());
        double realMoney = Double.parseDouble(scanner.nextLine());
        int couuntSpend = 0;
        int countAllDays = 0;

        while (neeedMoneyVacation > realMoney) {
            String whatDo = scanner.nextLine();
            double moneySpendSave = Double.parseDouble(scanner.nextLine());
            countAllDays++;

            if (whatDo.equals("spend")) {
                realMoney = realMoney - moneySpendSave;
                if (realMoney < 0) {
                    realMoney = 0;
                }
                couuntSpend++;
                if (couuntSpend == 5) {
                    break;
                }

            } else {
                realMoney = realMoney + moneySpendSave;
                couuntSpend = 0;
            }

        }

        String output = "";


        if (realMoney >= neeedMoneyVacation) {
            output = String.format("You saved the money for %d days.", countAllDays);
        }
        else {
            output = String.format("You can't save the money.%n" + "%d", countAllDays);
        }

        System.out.println(output);


    }
}
