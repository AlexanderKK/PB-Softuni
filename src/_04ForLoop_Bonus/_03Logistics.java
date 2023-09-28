package _04ForLoop_Bonus;

import java.util.*;

public class _03Logistics{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());
        int loadSum = 0;
        double price = 0;
        int sumBus = 0;
        int sumTruck = 0;
        int sumTrain = 0;

        for(int i = 0; i < loads; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if(tons <= 3) {
                price += tons * 200;
                sumBus += tons;
            } else if(tons <= 11) {
                price += tons * 175;
                sumTruck += tons;
            } else {
                price += tons * 120;
                sumTrain += tons;
            }
            loadSum += tons;
        }

        double average = price / loadSum;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", sumBus * 1.0 / loadSum * 100);
        System.out.printf("%.2f%%%n", sumTruck * 1.0 / loadSum * 100);
        System.out.printf("%.2f%%%n", sumTrain * 1.0 / loadSum * 100);
    }
}