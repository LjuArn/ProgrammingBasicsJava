package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimefortheExam {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());


        int examTime = hourExam * 60 + minExam;
        int arriveTime = hourArrive * 60 + minArrive;

            String output1 = "";
            String output2 = "";

        //•	“On time”,
        if (arriveTime <= examTime && arriveTime >= examTime - 30) {
            output1 = "On time";

            int difference = examTime - arriveTime;
            if (difference <= 30 && difference != 0) {
                output2 = String.format("%d minutes before the start", difference);
                //“mm minutes before the start” за идване по-рано с по-малко от час.
            }

            // Early
        } else if (arriveTime < examTime - 30) {
        output1 = "Early";
            int difference = examTime - arriveTime;


            if (difference < 60 && difference > 30){
                output2 = String.format("%d minutes before the start", difference);
            } else if (difference >= 60){

                int hours = difference / 60;
                int minutes = difference % 60;

                output2 = String.format("%d:%02d hours before the start",hours, minutes );
                // Минутите винаги печатайте с 2 цифри, например “1:05”.
            }

            // Late
        } else if (arriveTime > examTime) {
            output1 = "Late";
            int difference = arriveTime - examTime;

            if (difference < 60){
                output2 = String.format("%d minutes after the start", difference);
            }else {

                int hours = difference / 60;
                int minutes = difference % 60;

                output2 = String.format("%d:%02d hours after the start",hours, minutes );
                // Минутите винаги печатайте с 2 цифри, например “1:03”.

            }

        }

        System.out.println(output1);
        System.out.println(output2);
    }
}
