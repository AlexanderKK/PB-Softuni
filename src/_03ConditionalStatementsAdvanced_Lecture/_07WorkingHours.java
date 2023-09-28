package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

public class _07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String weekDay = scanner.nextLine();

        boolean isOpened = weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday") ||
                           weekDay.equals("Thursday") || weekDay.equals("Friday") || weekDay.equals("Saturday");

        if(isOpened && hours >= 10 && hours <= 18) {
            System.out.println("open");
        }
        else {
            System.out.println("closed");
        }
    }
}