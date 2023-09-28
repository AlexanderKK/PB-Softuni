package _04ForLoop_Lecture;

import java.util.Scanner;

public class _08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < limit; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}