package nestedLab;

import java.util.Scanner;

public class CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameFilm = scanner.nextLine();
        int totalTiketStud = 0;
        int totalTiketStand = 0;
        int totalTiketKids = 0;
        int totalTickets = 0;

        while (!nameFilm.equals("Finish")) {
            int countSeatsStud = 0;
            int countSeatsStand = 0;
            int countSeatsKids = 0;
            int allSeats = Integer.parseInt(scanner.nextLine());

            String seats = scanner.nextLine();
            int sumSeats = 0;

            while (!seats.equals("End")) {
                if (seats.equals("student")) {
                    countSeatsStud++;
                } else if (seats.equals("standard")) {
                    countSeatsStand++;
                } else if (seats.equals("kid")) {
                    countSeatsKids++;
                }
                sumSeats = countSeatsKids + countSeatsStand + countSeatsStud;
                if (allSeats <= sumSeats) {
                    break;
                }
                seats = scanner.nextLine();
            }
            double percentSeats = sumSeats * 1.0 / allSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", nameFilm, percentSeats);

            totalTiketStud +=countSeatsStud;
            totalTiketStand +=countSeatsStand;
            totalTiketKids +=countSeatsKids;

            totalTickets =  totalTiketKids + totalTiketStand + totalTiketStud;

            nameFilm = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", totalTiketStud * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", totalTiketStand * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", totalTiketKids * 1.0 / totalTickets * 100);


    }
}
