package forCicleEX;

import java.util.Scanner;

public class SelaryBest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //•	Заплата - число в интервала [700...1500]
        //След това n – на брой пъти се чете име на уебсайт – текст

        int n = Integer.parseInt(scanner.nextLine());
        int selary = Integer.parseInt(scanner.nextLine());
        boolean isLostSalary = false;

        for ( int i =1; i <= n; i++){
            String sait = scanner.nextLine();
            if (sait.equals("Facebook")){
                selary = selary - 150;
            } else if (sait.equals("Instagram")){
                selary = selary - 100;
            } else if (sait.equals("Reddit")){
                selary = selary - 50;
            }
            if (selary <= 0){
                isLostSalary = true;
                break;
            }
        }
        if (isLostSalary){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(selary);
        }

    }
}



