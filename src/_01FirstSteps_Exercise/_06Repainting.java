package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _06Repainting {
    public static void main(String[] args) {
//        1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
//        2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
//        3.	Количество разредител (в литри) - цяло число в интервала [1…30]
//        4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hoursOfWork = Integer.parseInt(scanner.nextLine());

        double totalPaint = paint * 1.1;
        int totalNylon = nylon + 2;

        double priceForMaterials = totalNylon * 1.50 + totalPaint * 14.50 + diluent * 5.00 + 0.40;

        double pricePerHourOfWork = priceForMaterials * 0.3;
        double priceForWork = pricePerHourOfWork * hoursOfWork;

        double totalPrice = priceForMaterials + priceForWork;

        System.out.println(totalPrice);
    }
}