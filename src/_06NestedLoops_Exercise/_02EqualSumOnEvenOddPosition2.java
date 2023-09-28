package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _02EqualSumOnEvenOddPosition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            int evenSum = 0;
            int oddSum = 0;

            int currentDigit = i;
            int reversedPos;
            String currentNum = i + "";

            if(currentNum.length() % 2 == 0) {
                reversedPos = 0;
            } else {
                reversedPos = 1;
            }

            while(currentDigit > 0) {
                int remainder = currentDigit % 10;
                if(reversedPos % 2 == 0) {
                    evenSum += remainder;
                } else {
                    oddSum += remainder;
                }

                reversedPos++;
                currentDigit /= 10;
            }

            if(evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}