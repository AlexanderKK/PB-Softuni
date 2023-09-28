package _07ExamPreparation0;

import java.util.Scanner;

public class _02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecPerMeter = Double.parseDouble(scanner.nextLine());

//        double delay = Math.floor(distanceInMeters / 50) * 30;
//        double totalTimeInSec = distanceInMeters * timeInSecPerMeter + delay;

        double totalTimeInSec = distanceInMeters * timeInSecPerMeter;
        double temp = distanceInMeters;

        while(temp >= 50) {
            totalTimeInSec += 30;
            temp -= 50;
        }

        double diff = totalTimeInSec - recordInSec;
        if(diff < 0) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTimeInSec);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}