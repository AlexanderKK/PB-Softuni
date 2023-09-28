package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _01PipePool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1Debit = Integer.parseInt(scanner.nextLine());
        int pipe2Debit = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1Liters = pipe1Debit * hours;
        double pipe2Liters = pipe2Debit * hours;

        double sumLiters = pipe1Liters + pipe2Liters;
        if(sumLiters <= volume) {
            double poolVolumePercent = (sumLiters / volume) * 100;
            double pipe1Percent = (pipe1Liters / sumLiters) * 100;
            double pipe2Percent = (pipe2Liters / sumLiters) * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolVolumePercent, pipe1Percent, pipe2Percent);
        }
        else {
            double litersOverFlow = sumLiters - volume;

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, litersOverFlow);
        }
    }
}