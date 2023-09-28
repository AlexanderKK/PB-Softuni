package _01FirstSteps_Lecture;

import java.util.Scanner;

public class _05GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = "Hello, " + input + "!";

        System.out.println(result);
    }
}