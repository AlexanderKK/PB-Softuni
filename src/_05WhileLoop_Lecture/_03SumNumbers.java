package _05WhileLoop_Lecture;

import java.util.Scanner;

public class _03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(sum < num) {
            int number = Integer.parseInt(scanner.nextLine());

            sum += number;
        }

        System.out.println(sum);
    }
}