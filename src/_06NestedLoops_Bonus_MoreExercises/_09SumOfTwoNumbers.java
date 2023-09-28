package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combinationCount = 0;
        boolean isFound = false;

        for (int i = firstNum; i <= lastNum; i++) {
            for (int j = firstNum; j <= lastNum; j++) {
                combinationCount++;

                if(i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCount, i, j, magicNum);
                    isFound = true;
                    break;
                }
            }

            if(isFound) {
                break;
            }
        }

        if(!isFound) {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNum);
        }
    }
}