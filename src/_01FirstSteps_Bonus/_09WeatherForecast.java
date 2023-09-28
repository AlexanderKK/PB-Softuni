package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.compareTo("sunny") != 0) {
            System.out.println("It's cold outside!");
        }
        else {
            System.out.println("It's warm outside!");
        }
    }
}