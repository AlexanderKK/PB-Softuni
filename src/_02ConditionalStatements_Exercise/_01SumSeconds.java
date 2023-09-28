package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeInSeconds = timeFirst + timeSecond + timeThird;

        int minutes = timeInSeconds / 60;

        int seconds = timeInSeconds % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}