package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

import static java.lang.System.*;

public class _03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();

        switch (name) {
            case "dog":
                out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                out.println("reptile");
                break;
            default:
                out.println("unknown");
        }
    }
}