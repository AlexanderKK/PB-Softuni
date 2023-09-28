package _07ExamPreparation10;

import java.util.Scanner;

public class _05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        double sumSugarPackets = 0;
        double sumFlourPackets = 0;
        int maxSugar = 0;
        int maxFlour = 0;

        for (int i = 1; i <= easterBreads; i++) {
            int usedSugarGrams = Integer.parseInt(scanner.nextLine());
            int usedFlourGrams = Integer.parseInt(scanner.nextLine());

            sumSugarPackets += usedSugarGrams / 950.0;
            sumFlourPackets += usedFlourGrams / 750.0;

            if(usedSugarGrams > maxSugar) {
                maxSugar = usedSugarGrams;
            }
            if(usedFlourGrams > maxFlour) {
                maxFlour = usedFlourGrams;
            }
        }

        System.out.printf("Sugar: %.0f%n", Math.ceil(sumSugarPackets));
        System.out.printf("Flour: %.0f%n", Math.ceil(sumFlourPackets));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}