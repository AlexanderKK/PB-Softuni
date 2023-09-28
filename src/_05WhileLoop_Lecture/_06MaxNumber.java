package _05WhileLoop_Lecture;

import java.util.Scanner;

public class _06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("Stop")) {
                break;
            }
            int number = Integer.parseInt(input);

            if(number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}