package _07ExamPreparation4;

import java.util.Scanner;

public class _04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalProfit = 0;
        int sumPeople = 0;
        boolean isFull = false;

        while(!command.equals("Movie time!")) {
            int people = Integer.parseInt(command);

            if(hallCapacity < sumPeople) {
                isFull = true;
                break;
            }

            int currentBill = people * 5;
            if(people % 3 == 0) {
                currentBill -= 5;
            }

            totalProfit += currentBill;
            sumPeople += people;

            command = scanner.nextLine();
        }

        if(isFull) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity - sumPeople);
        }
        System.out.printf("Cinema income - %d lv.", totalProfit);
    }
}