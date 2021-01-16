package forCicleEX;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int selary = Integer.parseInt(scanner.nextLine());

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
                break;
            }

        }

        if (selary <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(selary);
        }

    }
}
