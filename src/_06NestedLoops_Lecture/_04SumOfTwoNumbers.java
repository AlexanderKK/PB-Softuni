package _06NestedLoops_Lecture;

import java.util.Scanner;

public class _04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int firstNum;
        int secondNum = 0;
        int combinationCount = 0;
        boolean isFound = false;

        for (firstNum = start; firstNum <= end; firstNum++) {
            for (secondNum = start; secondNum <= end ; secondNum++) {
                combinationCount++;

                if(firstNum + secondNum == magicNumber) {
                    isFound = true;
                    break;
                }
            }

            if(isFound) {
                break;
            }
        }

        if(isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinationCount, firstNum, secondNum, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNumber);
        }
    }
}