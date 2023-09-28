package _07ExamPreparation5;

import java.util.Scanner;

public class _02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double timeForDay = timeForPhotos * .15 + scenes * sceneDuration;

        double diff = Math.abs(timeForDay - timeForPhotos);
        if(timeForDay <= timeForPhotos) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);
        }
    }
}