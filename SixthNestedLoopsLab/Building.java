package nestedLab;

import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int flours = Integer.parseInt(scanner.nextLine());
        int numberRooms = Integer.parseInt(scanner.nextLine());

        for (int i = flours; i >= 1 ; i--) {
            System.out.println();
            for (int j = 0; j < numberRooms; j++) {

                if (i==flours){
                    System.out.printf("L%d%d ", i, j);
                }else if (i%2==0){
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            
        }

        
    }
}
