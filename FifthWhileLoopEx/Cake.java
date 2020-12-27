package whileCicleEx;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int cakePieces = wight * lenght;

        String comannd = scanner.nextLine();

        while (!comannd.equals("STOP")) {
            int numberPiece = Integer.parseInt(comannd);
            cakePieces = cakePieces - numberPiece;
            if (cakePieces <= 0) {
                break;
            }
            comannd = scanner.nextLine();
        }

        String output = "";

        if (cakePieces > 0) {
            output = String.format("%d pieces are left.", cakePieces);
        } else {
            output = String.format("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }
        System.out.println(output);

    }
}
