package _04ForLoop_Bonus;

import java.util.Scanner;

public class _07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sumA = 0;
        int sumB = 0;
        int sumV = 0;
        int sumG = 0;

        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();

            if(sector.equals("A")) {
                sumA++;
            } else if(sector.equals("B")) {
                sumB++;
            } else if(sector.equals("V")) {
                sumV++;
            } else if(sector.equals("G")) {
                sumG++;
            }
        }

        System.out.printf("%.2f%%%n", (double)sumA / fans * 100);
        System.out.printf("%.2f%%%n", (double)sumB / fans * 100);
        System.out.printf("%.2f%%%n", (double)sumV / fans * 100);
        System.out.printf("%.2f%%%n", (double)sumG / fans * 100);
        System.out.printf("%.2f%%%n", (double)fans / stadiumCapacity * 100);
    }
}