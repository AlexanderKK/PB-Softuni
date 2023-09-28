package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double income = 0;
        if(trace.equals("trail")) {
            income += juniors * 5.50 + seniors * 7;
        } else if(trace.equals("cross-country")) {
            income += juniors * 8 + seniors * 9.50;
        } else if(trace.equals("downhill")) {
            income += juniors * 12.25 + seniors * 13.75;
        } else if(trace.equals("road")) {
            income += juniors * 20 + seniors * 21.50;
        }

        int participants = juniors + seniors;
        if(trace.equals("cross-country") && participants >= 50) {
            income -= income * .25;
        }
        income -= income * .05;

        System.out.printf("%.2f", income);
    }
}