package _07ExamPreparation10;

import java.util.Scanner;

public class _03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColour = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());   //брой партиди

        int price = 0;
        if(eggColour.equals("Red")) {
            if(eggSize.equals("Large")) {
                price = 16;
            } else if(eggSize.equals("Medium")) {
                price = 13;
            } else if(eggSize.equals("Small")) {
                price = 9;
            }
        } else if(eggColour.equals("Green")) {
            if(eggSize.equals("Large")) {
                price = 12;
            } else if(eggSize.equals("Medium")) {
                price = 9;
            } else if(eggSize.equals("Small")) {
                price = 8;
            }
        } else if(eggColour.equals("Yellow")) {
            if(eggSize.equals("Large")) {
                price = 9;
            } else if(eggSize.equals("Medium")) {
                price = 7;
            } else if(eggSize.equals("Small")) {
                price = 5;
            }
        }
        double cost = price * batches * .65;
        System.out.printf("%.2f leva.", cost);
    }
}