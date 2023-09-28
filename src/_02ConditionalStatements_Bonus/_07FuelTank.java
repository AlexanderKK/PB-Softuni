package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        String[] fuels = {"Diesel", "Gasoline", "Gas"};
        boolean isPresent = false;

        for(String fuel: fuels) {
            if(fuelType.equals(fuel)) {
                isPresent = true;
                break;
            }
        }

        if(isPresent) {
            if(liters < 25) {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
            else {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            }
        }
        else {
            System.out.println("Invalid fuel!");
        }
    }
}