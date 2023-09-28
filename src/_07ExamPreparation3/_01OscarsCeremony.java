package _07ExamPreparation3;

import java.util.Scanner;

public class _01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statues = rent * .7;
        double catering = statues * .85;
        double dubbing = catering / 2;

        double cost = rent + statues + catering + dubbing;
        System.out.printf("%.2f", cost);
    }
}