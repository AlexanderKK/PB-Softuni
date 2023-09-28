package _07ExamPreparation4;

import java.util.Scanner;

public class _01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double episodesDurationWithAds = episodes * episodeDuration * 1.2;
        int specialEpisodesDuration = seasons * 10;

        double timeToWatch = Math.floor(seasons * episodesDurationWithAds + specialEpisodesDuration);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", series, timeToWatch);
    }
}