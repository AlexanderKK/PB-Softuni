package _07ExamPreparation9;

import java.util.Scanner;

public class _06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int maxPoints = 0;
        String bestBaker = "";

        for (int i = 1; i <= easterBreads; i++) {
            String baker = scanner.nextLine();
            int sumPoints = 0;

            String command = scanner.nextLine();
            while(!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                sumPoints += points;

                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, sumPoints);
            if(sumPoints > maxPoints) {
                maxPoints = sumPoints;
                System.out.printf("%s is the new number 1!%n", baker);
                bestBaker = baker;
            }
        }
        System.out.printf("%s won competition with %d points!", bestBaker, maxPoints);
    }
}