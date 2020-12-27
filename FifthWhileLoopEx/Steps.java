package whileCicleEx;

import java.util.Scanner;

public class Steps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String comamand = scanner.nextLine();
        int allSteps = 0;
        boolean goalReach = false;

        while(!comamand.equals("Going home")){

            int steps = Integer.parseInt(comamand);

            allSteps = allSteps + steps;
            if (allSteps > 10000){
                goalReach = true;
                break;
            }

            comamand = scanner.nextLine();
        }



        String output = "";


        if (goalReach){
            output = String.format("Goal reached! Good job!%n%d steps over the goal!", allSteps - 10000);
        }else {
            int addSteps= Integer.parseInt(scanner.nextLine());
            int totalSteps = 10000 - allSteps - addSteps;
            if (totalSteps < 0){
                output = String.format("Goal reached! Good job!%n%d steps over the goal!", Math.abs(totalSteps));
            }else {
                output = String.format("%d more steps to reach goal.", totalSteps);
            }
        }

        System.out.println(output);

    }
}
