package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _04CarToGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        if(budget <= 100) {
            carClass = "Economy class";
            if(season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * .35;
            } else if(season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * .65;
            }
        } else if(budget <= 500) {
            carClass = "Compact class";
            if(season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * .45;
            } else if(season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * .8;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * .9;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}