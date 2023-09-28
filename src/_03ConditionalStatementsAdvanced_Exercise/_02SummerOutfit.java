package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if(temp >= 10 && temp <= 18) {
            if ("Morning".equals(time)) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if ("Afternoon".equals(time) || "Evening".equals(time)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        else if(temp > 18 && temp <= 24) {
            if("Morning".equals(time) || "Evening".equals(time)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if("Afternoon".equals(time)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if(temp >= 25) {
            if ("Morning".equals(time)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if("Afternoon".equals(time)) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if("Evening".equals(time)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", temp, outfit, shoes);
    }
}