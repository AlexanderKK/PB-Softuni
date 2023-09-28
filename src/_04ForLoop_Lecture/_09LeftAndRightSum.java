package _04ForLoop_Lecture;

import java.util.Scanner;

public class _09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

//        for (int i = 0; i < times; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            sumLeft += currentNum;
//        }
//        for (int i = 0; i < times; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            sumRight += currentNum;
//        }
        for (int i = 1; i <= times * 2; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if(i <= times) {
                sumLeft += currentNum;
            } else {
                sumRight += currentNum;
            }
        }

        if(sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", diff);
        }
    }
}