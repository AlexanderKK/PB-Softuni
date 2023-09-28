package _07ExamPreparation1;

import java.util.Scanner;

public class _01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrance = Double.parseDouble(scanner.nextLine());
        double priceForLounge = Double.parseDouble(scanner.nextLine());
        double priceForUmbrella = Double.parseDouble(scanner.nextLine());

        double entranceCost = people * entrance;
        double loungesCost = Math.ceil(people * .75) * priceForLounge;
        double umbrellasCost = Math.ceil(people / 2.0) * priceForUmbrella;

        double total = entranceCost + loungesCost + umbrellasCost;

        System.out.printf("%.2f lv.", total);
    }
}