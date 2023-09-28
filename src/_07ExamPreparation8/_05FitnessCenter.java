package _07ExamPreparation8;

import java.util.Scanner;

public class _05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());
        String []activities = {"Back", "Chest", "Legs", "Abs"};
        int sumTrainingPeople = 0;
        int sumOthers = 0;
        int sumBack = 0;
        int sumChest = 0;
        int sumLegs = 0;
        int sumAbs = 0;
        int sumProteinShake = 0;
        int sumProteinBar = 0;

        for (int i = 0; i < customers; i++) {
            String activity = scanner.nextLine();

            for (String act: activities) {
                if (activity.equals(act)) {
                    sumTrainingPeople++;
                    break;
                }
            }

            if (activity.equals(activities[0])) {
                sumBack++;
            } else if (activity.equals(activities[1])) {
                sumChest++;
            } else if (activity.equals(activities[2])) {
                sumLegs++;
            } else if (activity.equals(activities[3])) {
                sumAbs++;
            }

            if(activity.equals("Protein shake")) {
                sumProteinShake++;
                sumOthers++;
            } else if(activity.equals("Protein bar")) {
                sumProteinBar++;
                sumOthers++;
            }
        }

        System.out.printf("%d - back%n", sumBack);
        System.out.printf("%d - chest%n", sumChest);
        System.out.printf("%d - legs%n", sumLegs);
        System.out.printf("%d - abs%n", sumAbs);
        System.out.printf("%d - protein shake%n", sumProteinShake);
        System.out.printf("%d - protein bar%n", sumProteinBar);
        System.out.printf("%.2f%% - work out%n", 1.0 * sumTrainingPeople / customers * 100);
        System.out.printf("%.2f%% - protein", 1.0 * sumOthers / customers * 100);
    }
}