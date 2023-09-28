package _07ExamPreparation7;

import java.util.Scanner;

public class _03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String appliance = scanner.nextLine();

        String[] countries = {"Russia", "Bulgaria", "Italy"};
        String[] appliances = {"ribbon", "hoop", "rope"};

        double scoreDifficulty = 0;
        double scorePerformance = 0;

        if(country.equals(countries[0])) {
            if(appliance.equals(appliances[0])) {
                scoreDifficulty = 9.1;
                scorePerformance = 9.4;
            } else if(appliance.equals(appliances[1])) {
                scoreDifficulty = 9.3;
                scorePerformance = 9.8;
            } else if(appliance.equals(appliances[2])) {
                scoreDifficulty = 9.6;
                scorePerformance = 9;
            }
        } else if(country.equals(countries[1])) {
            if(appliance.equals(appliances[0])) {
                scoreDifficulty = 9.6;
                scorePerformance = 9.4;
            } else if(appliance.equals(appliances[1])) {
                scoreDifficulty = 9.55;
                scorePerformance = 9.75;
            } else if(appliance.equals(appliances[2])) {
                scoreDifficulty = 9.5;
                scorePerformance = 9.4;
            }
        } else if(country.equals(countries[2])) {
            if(appliance.equals(appliances[0])) {
                scoreDifficulty = 9.2;
                scorePerformance = 9.5;
            } else if(appliance.equals(appliances[1])) {
                scoreDifficulty = 9.45;
                scorePerformance = 9.35;
            } else if(appliance.equals(appliances[2])) {
                scoreDifficulty = 9.7;
                scorePerformance = 9.15;
            }
        }

        double totalScore = scoreDifficulty + scorePerformance;
        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, appliance);
        System.out.printf("%.2f%%%n", (20 - totalScore) / 20 * 100);
    }
}