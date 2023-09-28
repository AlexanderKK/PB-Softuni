package _07ExamPreparation11;

import java.util.Scanner;

public class _04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int sumRed = 0;
        int sumOrange = 0;
        int sumYellow = 0;
        int sumWhite= 0;
        int sumBlack= 0;
        int sumOthers= 0;
        for (int i = 1; i <= ballsCount; i++) {
            String colour = scanner.nextLine();

            if(colour.equals("red")) {
                points += 5;
                sumRed++;
            } else if(colour.equals("orange")) {
                points += 10;
                sumOrange++;
            } else if(colour.equals("yellow")) {
                points += 15;
                sumYellow++;
            } else if(colour.equals("white")) {
                points += 20;
                sumWhite++;
            } else if(colour.equals("black")) {
                points = (int)Math.floor(points / 2.0);
                sumBlack++;
            } else {
                sumOthers++;
            }
        }

        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", sumRed);
        System.out.printf("Orange balls: %d%n", sumOrange);
        System.out.printf("Yellow balls: %d%n", sumYellow);
        System.out.printf("White balls: %d%n", sumWhite);
        System.out.printf("Other colors picked: %d%n", sumOthers);
        System.out.printf("Divides from black balls: %d", sumBlack);
    }
}