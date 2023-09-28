package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalTicketsCount = 0;
        int sumStudents = 0;
        int sumStandards = 0;
        int sumKids = 0;

        while(!command.equals("Finish")) {
            String movie = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsCount = 0;

            String input = scanner.nextLine();
            while(!input.equals("End")) {
                String ticketType = input;
                if(ticketType.equals("student")) {
                    sumStudents++;
                } else if(ticketType.equals("standard")) {
                    sumStandards++;
                } else if(ticketType.equals("kid")) {
                    sumKids++;
                }

                ticketsCount++;
                totalTicketsCount++;

                if(freeSeats - ticketsCount <= 0) {
                    break;
                }
                input = scanner.nextLine();
            }
            double salonFilled = ticketsCount * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, salonFilled);

            command = scanner.nextLine();
        }

        double students = 1.0 * sumStudents / totalTicketsCount * 100;
        double standards = 1.0 * sumStandards / totalTicketsCount * 100;
        double kids = 1.0 * sumKids / totalTicketsCount * 100;

        System.out.printf("Total tickets: %d%n", totalTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", students);
        System.out.printf("%.2f%% standard tickets.%n", standards);
        System.out.printf("%.2f%% kids tickets.%n", kids);
    }
}