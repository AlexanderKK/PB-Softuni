package _07ExamPreparation11;

import java.util.Scanner;

public class _01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double priceNetTicketAdult = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double costAdults = ticketsAdults * (priceNetTicketAdult + priceService);
        double costKids = ticketsKids * (priceNetTicketAdult * .3 + priceService);
        double agencyProfit = (costAdults + costKids) * .2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, agencyProfit);
    }
}