package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double timeForDistance = distanceInMeters * secondsPerMeter;

        int timesSlowed = (int)distanceInMeters / 15;

        double timeLost = timesSlowed * 12.5;

        double timeInSec = timeForDistance + timeLost;

        double difference = timeInSec - recordInSeconds;

        if(difference < 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeInSec);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}