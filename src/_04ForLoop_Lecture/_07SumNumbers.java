package _04ForLoop_Lecture;

import java.util.Scanner;

public class _07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(limit > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            limit--;
        }

        System.out.println(sum);
    }
}