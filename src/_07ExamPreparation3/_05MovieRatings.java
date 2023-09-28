package _07ExamPreparation3;

import java.util.Scanner;

public class _05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());
        double sumRating = 0;
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        String bestMovie = "";
        String worstMovie = "";

        for (int i = 0; i < movies; i++) {
            String title = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRating += rating;

            if(rating > maxRating) {
                maxRating = rating;
                bestMovie = title;
            } else if(rating < minRating) {
                minRating = rating;
                worstMovie = title;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", sumRating / movies);
    }
}