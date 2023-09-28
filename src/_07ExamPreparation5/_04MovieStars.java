package _07ExamPreparation5;

import java.util.Scanner;

public class _04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double actorsBudget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        while(!command.equals("ACTION")) {
            String actorName = command;
            double reward;
            if(actorName.length() <= 15) {
                reward = Double.parseDouble(scanner.nextLine());
            } else {
                reward = actorsBudget * .2;
            }
            actorsBudget -= reward;
            if(actorsBudget < 0) {
                System.out.printf("We need %.2f leva for our actors.",  Math.abs(actorsBudget));
                break;
            }

            command = scanner.nextLine();
        }

        if(actorsBudget >= 0) {
            System.out.printf("We are left with %.2f leva.", actorsBudget);
        }
    }
}