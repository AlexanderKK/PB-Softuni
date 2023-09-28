package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String screening = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if(screening.equals("Premiere")) {
            income = rows * cols * 12;
        } else if(screening.equals("Normal")) {
            income = rows * cols * 7.50;
        } else if(screening.equals("Discount")) {
            income = rows * cols * 5;
        }

        System.out.printf("%.2f leva" ,income);
    }
}