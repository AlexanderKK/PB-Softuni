package _07ExamPreparation9;

import java.util.Scanner;

public class _05EasterEggs {
    static String maxColour = "";
    static int max = 0;
    static void maxColour(int sumEggs, String colour) {
        if(sumEggs > max) {
            max = sumEggs;
            maxColour = colour;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());
        int sumRed = 0;
        int sumOrange = 0;
        int sumBlue = 0;
        int sumGreen = 0;

        for (int i = 1; i <= paintedEggs; i++) {
            String colour = scanner.nextLine();

            if(colour.trim().equals("red")) {
                sumRed++;
                maxColour(sumRed, "red");
            } else if(colour.trim().equals("orange")) {
                sumOrange++;
                maxColour(sumOrange, "orange");
            } else if(colour.trim().equals("blue")) {
                sumBlue++;
                maxColour(sumBlue, "blue");
            } else if(colour.trim().equals("green")) {
                sumGreen++;
                maxColour(sumGreen, "green");
            }
        }

        System.out.printf("Red eggs: %d%n", sumRed);
	    System.out.printf("Orange eggs: %d%n", sumOrange);
	    System.out.printf("Blue eggs: %d%n", sumBlue);
	    System.out.printf("Green eggs: %d%n", sumGreen);
	    System.out.printf("Max eggs: %d -> %s", max, maxColour);
    }
}