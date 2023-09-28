package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double doorArea = 1.2 * 2;
        double windowsArea = 1.5 * 1.5 * 2;
        double spareArea = doorArea + windowsArea;
        double squareWallsArea = x * x * 2;
        double rectangleWallsArea = x * y * 2;

        double greenArea = squareWallsArea + rectangleWallsArea - spareArea;
        double litersGreenArea = greenArea / 3.4;

        double triangleWallsRoofArea = (x * h / 2) * 2;
        double rectangleWallsRoofArea = x * y * 2;

        double redArea = triangleWallsRoofArea + rectangleWallsRoofArea;
        double litersRedArea = redArea / 4.3;

        System.out.printf("%.2f%n", litersGreenArea);
        System.out.printf("%.2f%n", litersRedArea);
    }
}