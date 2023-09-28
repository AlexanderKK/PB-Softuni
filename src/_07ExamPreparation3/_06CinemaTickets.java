package _07ExamPreparation3;

import java.util.Scanner;

public class _06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seatsTaken = 0;
        int students = 0;
        int standards = 0;
        int kids = 0;

        String command = scanner.nextLine();
        while(!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(scanner.nextLine());

            int currentSeats = 0;
            String input = scanner.nextLine();
            while(!input.equals("End")) {
                String ticket = input;
                if(ticket.equals("student")) {
                    students++;
                } else if(ticket.equals("standard")) {
                    standards++;
                } else if(ticket.equals("kid")) {
                    kids++;
                }

                seatsTaken++;
                currentSeats++;
                if(currentSeats >= seats) {
                    break;
                }

                input = scanner.nextLine();
            }

            double partTaken = 1.0 * currentSeats / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, partTaken);

            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", seatsTaken);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * students / seatsTaken * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standards / seatsTaken * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * kids / seatsTaken * 100);
    }
}