package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int fails = 0;
        int problems = 0;
        int sumGrades = 0;
        String lastProblem = "";
        boolean isFailed = false;

        while(!command.equals("Enough")) {
            String currentProblem = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if(grade <= 4) {
                fails++;
            }

            if(fails == failedThreshold) {
                isFailed = true;
                break;
            }

            problems++;
            lastProblem = currentProblem;
            sumGrades += grade;

            command = scanner.nextLine();
        }

        double average = (double)sumGrades / problems;

        if(!isFailed) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", problems);
            System.out.printf("Last problem: %s%n", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", fails);
        }
    }
}