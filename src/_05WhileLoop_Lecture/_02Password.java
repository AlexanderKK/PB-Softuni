package _05WhileLoop_Lecture;

import java.util.Scanner;

public class _02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while(!password.equals(input)) {
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}