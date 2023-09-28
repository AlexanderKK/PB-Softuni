package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _09CatFoodVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Почивни дни
        int days = Integer.parseInt(scanner.nextLine());
        //Общо консумирана храна на ден от Нео и Оникс (гр)
        double catFoodPerDayGr = Double.parseDouble(scanner.nextLine());

        double foodNeeded = catFoodPerDayGr / 1000.0 * days;

        int result = (int)Math.ceil(foodNeeded);

        System.out.printf("Neo and Onyx will need %d kg of food for %d days", result, days);
    }
}