package _07ExamPreparation0;

import java.util.Scanner;

public class _04Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double score = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        boolean isNominated = false;

        for (int i = 1; i <= judges; i++) {
            String name = scanner.nextLine();
            double currentScore = Double.parseDouble(scanner.nextLine());

            score += name.length() * currentScore / 2;

            if(score > 1250.5) {
                isNominated = true;
                break;
            }
        }

        if(isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, score);
        } else {
            double diff = 1250.5 - score;
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}