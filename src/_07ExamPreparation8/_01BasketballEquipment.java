package _07ExamPreparation8;

import java.util.Scanner;

public class _01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearCost = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearCost * .6;
        double basketballEqPrice = sneakersPrice * .8;
        double ballPrice = basketballEqPrice * .25;
        double accessoriesPrice = ballPrice / 5;

        double totalCost = yearCost + sneakersPrice + basketballEqPrice + ballPrice + accessoriesPrice;
        System.out.printf("%.2f", totalCost);
    }
}