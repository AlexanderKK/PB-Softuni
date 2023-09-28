package _05WhileLoop_Bonus;

import java.util.Scanner;

public class _01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int loadCount = 0;
        int detergent = bottles * 750;
        int sumPlates = 0;
        int sumPots = 0;
        boolean enough = true;

        while(!command.equals("End")) {
            int dishes = Integer.parseInt(command);
            loadCount++;
            if(loadCount % 3 != 0) {
                detergent -= dishes * 5;
                sumPlates += dishes;
            } else {
                detergent -= dishes * 15;
                sumPots += dishes;
            }

            if(detergent < 0) {
                enough = false;
                break;
            }

            command = scanner.nextLine();
        }

        if(enough) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", sumPlates, sumPots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}