package _07ExamPreparation10;

import java.util.Scanner;

public class _02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int easterBreads = (int)Math.ceil(guests / 3.0);
        int eggs = (int)Math.ceil(guests * 2);
        double costEaster = easterBreads * 4 + eggs * 0.45;

        if(costEaster <= budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n", easterBreads, eggs);
            System.out.printf("He has %.2f lv. left.", budget - costEaster);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", costEaster - budget);
        }
    }
}