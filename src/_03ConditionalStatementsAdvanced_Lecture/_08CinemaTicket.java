package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

public class _08CinemaTicket {
    public static void main(String[] args) {
        String weekDay;
        try(Scanner scanner = new Scanner(System.in)) {
            weekDay = scanner.nextLine();
        }

        int price = 0;

        switch(weekDay) {
            case "Monday":
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                break;
        }

        System.out.println(price);
    }
}