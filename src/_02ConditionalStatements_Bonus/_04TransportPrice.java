package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String travelTime = scanner.nextLine();
        double price = 0;

        if(travelTime.equals("day") || travelTime.equals("night")) {
            if(km >= 100) {
                price = 0.06 * km;
            } else if (km >= 20) {
                price = 0.09 * km;
            }
            else {
                price = 0.70;
                if(travelTime.equals("day")) {
                    price += 0.79 * km;
                }
                else {
                    price += 0.90 * km;
                }
            }
            System.out.printf("%.2f", price);
        }
    }
}