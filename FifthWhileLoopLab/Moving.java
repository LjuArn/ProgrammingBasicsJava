package whileCicleLab;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int allSpace = width * length * height;
        int newSpace = 0;
        String cases = scanner.nextLine();


        while (!cases.equals("Done")) {
            int space = Integer.parseInt(cases);

            newSpace = newSpace + space;
            if (newSpace > allSpace) {
                break;
            }
            cases = scanner.nextLine();

        }
        if (newSpace > allSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", newSpace - allSpace);
        } else {
            System.out.printf("%d Cubic meters left.", allSpace - newSpace);
        }

    }
}
