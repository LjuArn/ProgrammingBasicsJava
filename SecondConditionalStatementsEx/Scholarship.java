package ConditionalStatementsExercise;

import java.util.Scanner;

public class Scholarship {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Доход в лева - реално число в интервала [0.00..6000.00]
        //2.	Среден успех -  реално число в интервала [2.00...6.00]
        //3.	Минимална работна заплата - реално число в интервала [0.00..1000.00]


        double income = Double.parseDouble(scanner.nextLine());
        double everigeMark = Double.parseDouble(scanner.nextLine());
        double minSelary = Double.parseDouble(scanner.nextLine());
        double socialIncome = 0;
        double exelentIncome = 0;
        boolean noSocIn = false;
        boolean noExlIn = false;

        if (income < minSelary && everigeMark > 4.5) {
            socialIncome = minSelary * 0.35;
        } else {
            noSocIn = true;
        }

        if (everigeMark >= 5.5) {
            exelentIncome = everigeMark * 25;
        } else {
            noExlIn = true;
        }
        if (noSocIn && noExlIn) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialIncome > exelentIncome) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialIncome);
        } else if (exelentIncome >= socialIncome) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", exelentIncome);
        }
    }
}