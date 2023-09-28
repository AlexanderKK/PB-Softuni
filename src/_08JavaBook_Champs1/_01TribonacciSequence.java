package _08JavaBook_Champs1;

import java.util.ArrayList;
import java.util.Scanner;

public class _01TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First three digits in the sequence
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        //Add to number by step
        int number = Integer.parseInt(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());

        int tribonacciCurrent = third;
        boolean isFound = false;
        int spiralCurrent = number;
        int spiralCounter = 0;
        int spiralMultiplier = 1;

        while(tribonacciCurrent <= 1000000 && spiralCurrent <= 1000000) {
            if(tribonacciCurrent == spiralCurrent) {
                //Break
                System.out.println(tribonacciCurrent);
                isFound = true;
                break;
            } else if(tribonacciCurrent < spiralCurrent) {
                //New Tribonacci Number
                tribonacciCurrent = first + second + third;
                first = second;
                second = third;
                third = tribonacciCurrent;
            } else {
                //New Spiral Number
                spiralCurrent += step * spiralMultiplier;
                spiralCounter++;
                if(spiralCounter % 2 == 0) {
                    spiralMultiplier++;
                }
            }
        }

        if(!isFound) {
            System.out.println("No");
        }

//        int nextNumber = 0;

//        ArrayList<Integer>tribonacciNums = new ArrayList<>();
//        ArrayList<Integer>spiralNums = new ArrayList<>();
//
//        tribonacciNums.add(first);
//        tribonacciNums.add(second);
//        tribonacciNums.add(third);
//
//        //1
//        while(nextNumber < 1000000) {
//            nextNumber = first + second + third;
//            first = second;
//            second = third;
//            third = nextNumber;
//            tribonacciNums.add(third);
//        }
//
//        //2
//        spiralNums.add(number);
//        int i = 0;
//        int spiralStepMul = 1;
//        while(number < 1000000) {
//            //2
//            number += step * spiralStepMul;
//            spiralNums.add(number);
//
//            i++;
//            if(i % 2 == 0) {
//                spiralStepMul++;
//            }
//        }
//
//        //3 - Compare Two Arrays
//        boolean isFound = false;
//        for (int num1: tribonacciNums) {
//            for (int num2: spiralNums) {
//                if(num1 == num2 && num1 <= 1000000) {
//                    System.out.println(num1);
//                    isFound = true;
//                    break;
//                }
//            }
//
//            if(isFound) {
//                break;
//            }
//        }
//
//        if(!isFound) {
//            System.out.println("No");
//        }
    }
}