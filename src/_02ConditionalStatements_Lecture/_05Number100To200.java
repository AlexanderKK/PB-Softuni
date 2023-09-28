package _02ConditionalStatements_Lecture;

import java.util.Scanner;

public class _05Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if(input < 100) {
            System.out.println("Less than 100");
        }
        else if(input <= 200) {
            System.out.println("Between 100 and 200");
        }
        else {
            System.out.println("Greater than 200");
        }
    }
}