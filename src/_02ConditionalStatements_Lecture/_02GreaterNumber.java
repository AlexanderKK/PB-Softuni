package _02ConditionalStatements_Lecture;

import java.util.Scanner;

public class _02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());

        if(firstDigit > secondDigit) {
            System.out.println(firstDigit);
        }
        else {
            System.out.println(secondDigit);
        }
    }
}