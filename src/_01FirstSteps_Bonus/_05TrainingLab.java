package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wInCm = w * 100;
        double hInCm = h * 100;

        int modulo1 = (int) (hInCm - 100) % 70;
        int seatsPerRow = (int) (hInCm - 100 - modulo1) / 70;

        int modulo2 = (int) wInCm % 120;
        int rows = (int) (wInCm - modulo2) / 120;

        int seats = seatsPerRow * rows - 3;

        System.out.println(seats);
    }
}