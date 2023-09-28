package _07ExamPreparation2;

import java.util.Scanner;

public class _01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrance = Double.parseDouble(scanner.nextLine());
        double pricePerLounge = Double.parseDouble(scanner.nextLine());
        double pricePerUmbrella = Double.parseDouble(scanner.nextLine());

        double costLounges = pricePerLounge * Math.ceil(people * .75);
        double costUmbrellas = pricePerUmbrella * Math.ceil(people / 2.0);

        double totalCost = people * entrance + costLounges + costUmbrellas;
        System.out.printf("%.2f lv.", totalCost);
    }
}