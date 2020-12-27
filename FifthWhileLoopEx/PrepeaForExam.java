package whileCicleEx;

import java.util.Scanner;

public class PrepeaForExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String tasks = scanner.nextLine();
        int numberBadGrades = 0;
        boolean isFail = false;
        double allGrades = 0;
        int countGrade = 0;
        String lastTask = "";

        while (!tasks.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                numberBadGrades++;
                if (numberBadGrades == badGrades) {
                    isFail = true;
                    break;
                }
            }
            allGrades = allGrades + grade;
            countGrade++;
            lastTask = tasks;
            tasks = scanner.nextLine();
        }

        String output = "";

        if (isFail) {
            output = String.format("You need a break, %d poor grades.", numberBadGrades);
        } else {
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", allGrades/countGrade, countGrade,lastTask);
        }

        System.out.println(output);


    }
}
