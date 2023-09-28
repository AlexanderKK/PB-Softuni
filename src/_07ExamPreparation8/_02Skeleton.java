package _07ExamPreparation8;

import java.util.Scanner;

public class _02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double chuteMeters = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int controlNorm = controlMinutes * 60 + controlSeconds;

        double secondsSlowedDown = chuteMeters / 120 * 2.5;

        double time = secondsFor100Meters * chuteMeters / 100 - secondsSlowedDown;

        double diff = time - controlNorm;
        if(diff <= 0) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(diff));
        }
    }
}