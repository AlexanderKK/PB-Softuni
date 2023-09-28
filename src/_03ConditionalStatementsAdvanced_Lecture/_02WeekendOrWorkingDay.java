package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

public class _02WeekendOrWorkingDay {
    public static void main(String[] args) {
        String day;

        try (Scanner scanner = new Scanner(System.in)) {
            day = scanner.nextLine();
        }

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}