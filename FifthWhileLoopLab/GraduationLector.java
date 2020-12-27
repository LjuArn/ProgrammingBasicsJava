package whileCicleLab;

import java.util.Scanner;

public class GraduationLector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double allGrade = 0.0;
        int grade = 0;
        int badGradesCounter = 0;

        while (grade < 12) {
            grade++;
            double mark = Double.parseDouble(scanner.nextLine());

            if (mark < 4) {
                badGradesCounter++;
                if (badGradesCounter == 2){
                    break;
                }
                continue;

            }
            allGrade = allGrade + mark;

        }


        if (badGradesCounter == 2){
            System.out.printf("%s has been excluded at %d grade", name, --grade );
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrade / 12);
        }

    }
}
