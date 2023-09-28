package _07ExamPreparation10;

import java.util.Scanner;

public class _04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsQty = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int sumEggs = 0;
        boolean noMoreEggs = false;
        int eggsOrder = 0;
        while(!command.equals("Close")) {
            String choice = command;
            eggsOrder = Integer.parseInt(scanner.nextLine());

            if(choice.equals("Buy")) {
                sumEggs += eggsOrder;
                eggsQty -= eggsOrder;
            } else if(choice.equals("Fill")) {
                eggsQty += eggsOrder;
            }

            if(eggsQty < 0) {
                noMoreEggs = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(!noMoreEggs) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sumEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsOrder - Math.abs(eggsQty));
        }
    }
}