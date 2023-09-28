package _02ConditionalStatements_Lecture;

import java.util.Scanner;

public class _03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());

        if(digit % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}