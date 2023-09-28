package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsPerDay = 0;
        boolean goalReached = true;

        while(stepsPerDay <= 10000) {
            String input = scanner.nextLine();

            if(input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsPerDay += stepsToHome;

                if(stepsPerDay < 10000) {
                    goalReached = false;
                    break;
                }
            } else {
                int steps = Integer.parseInt(input);
                stepsPerDay += steps;
            }
        }

        int diff = Math.abs(stepsPerDay - 10000);

        if(goalReached) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}