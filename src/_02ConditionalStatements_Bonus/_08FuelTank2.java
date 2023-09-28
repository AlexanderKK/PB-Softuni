package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _08FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCart = scanner.nextLine();

        double gasolinePrice = 2.22 * liters;
        double dieselPrice = 2.33 * liters;
        double gasPrice = 0.93 * liters;

        double total = 0;

        if(clubCart.equals("Yes")) {
            if(fuelType.equals("Gas")) {
                total = gasPrice - (liters * 0.08);
            }
            else if(fuelType.equals("Gasoline")) {
                total = gasolinePrice - (liters * 0.18);
            }
            else if(fuelType.equals("Diesel")) {
                total = dieselPrice - (liters * 0.12);
            }
        } else if (clubCart.equals("No")) {
            if(fuelType.equals("Gas")) {
                total = gasPrice;
            }
            else if(fuelType.equals("Gasoline")) {
                total = gasolinePrice;
            }
            else if(fuelType.equals("Diesel")) {
                total = dieselPrice;
            }
        }
        if(liters >= 20 && liters <= 25) {
            total -= total * 0.08;
        }
        else if(liters > 25) {
            total -= total * 0.1;
        }
        System.out.printf("%.2f lv.", total);
    }
}