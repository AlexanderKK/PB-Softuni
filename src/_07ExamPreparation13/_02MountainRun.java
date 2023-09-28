package _07ExamPreparation13;

import java.util.Scanner;

public class _02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1Meter = Double.parseDouble(scanner.nextLine());

        double secondsSlowed = Math.floor(distanceInMeters / 50) * 30;    //Every 50 meters Georgi is slowed with 30 seconds
        double timeInSec = distanceInMeters * timeInSecFor1Meter + secondsSlowed;

        if(timeInSec < recordInSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", timeInSec);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", timeInSec - recordInSec);
        }
    }
}