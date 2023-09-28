package _07ExamPreparation13;

import java.util.Scanner;

public class _04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int sumMusala = 0;
        int sumMontBlanc = 0;
        int sumKilimanjaro = 0;
        int sumK2 = 0;
        int sumEverest = 0;

        int sumPeople = 0;
        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sumPeople += people;

            if(people <= 5) {
                sumMusala += people;
            } else if(people <= 12) {
                sumMontBlanc += people;
            } else if(people <= 25) {
                sumKilimanjaro += people;
            } else if(people <= 40) {
                sumK2 += people;
            } else {
                sumEverest += people;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * sumMusala / sumPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * sumMontBlanc / sumPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * sumKilimanjaro / sumPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * sumK2 / sumPeople * 100);
        System.out.printf("%.2f%%", 1.0 * sumEverest / sumPeople * 100);
    }
}