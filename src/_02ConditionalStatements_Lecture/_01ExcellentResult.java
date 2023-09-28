package _02ConditionalStatements_Lecture;

import java.util.Scanner;

public class _01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if(grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}