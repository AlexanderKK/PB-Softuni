package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerYear = Double.parseDouble(scanner.nextLine());
        double sneakers = pricePerYear - pricePerYear * 0.4;
        double kit = sneakers - sneakers * 0.2;
        double ball = kit * 0.25;
        double accessories = ball * .2;

        double finalPrice = pricePerYear + sneakers + kit + ball + accessories;

        System.out.println(finalPrice);
    }
}