package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentSpace = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;

        double liters = volume / 1000.00;
        double litersOfWater = liters * (1 - percentSpace / 100);

        System.out.println(litersOfWater);
    }
}