package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

public class _09FruitOrVeg {
    public static void main(String[] args) {
        String product;

        try(Scanner scanner = new Scanner(System.in);) {
            product = scanner.nextLine();
        }

        switch(product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}