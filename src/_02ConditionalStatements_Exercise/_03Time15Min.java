package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _03Time15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sum = hours * 60 + minutes + 15;

        int sumHour = sum / 60;
        if(sumHour > 23) {
            sumHour -= 24;
        }

        int sumMin = sum % 60;

        if(sumMin < 10) {
            System.out.printf("%d:0%d", sumHour, sumMin);
        }
        else {
            System.out.printf("%d:%d", sumHour, sumMin);
        }
    }
}