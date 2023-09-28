package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _02EqualSumOnEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        while(firstNum < 100000 || secondNum > 300000) {
            firstNum = Integer.parseInt(scanner.nextLine());
            secondNum = Integer.parseInt(scanner.nextLine());
        }

//        for (int i = firstNum; i <= secondNum; i++) {
//            int oddNumbers = 0;
//            int evenNumbers = 0;
//            int counter = 0;
//            int temp = i;
//
//            while(temp > 0) {
//                int remainder = temp % 10;
//
//                if(counter % 2 != 0) {
//                    oddNumbers += remainder;
//                } else {
//                    evenNumbers += remainder;
//                }
//
//                temp /= 10;
//                counter++;
//            }
//
//            if(oddNumbers == evenNumbers) {
//                System.out.print(i + " ");
//            }
//        }

        for (int i = firstNum; i <= secondNum; i++) {
            int oddNumbers = 0;
            int evenNumbers = 0;

            String number = "" + i;
            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));

                if(j % 2 != 0) {
                    oddNumbers += digit;
                } else {
                    evenNumbers += digit;
                }
            }

            if(oddNumbers == evenNumbers) {
                System.out.print(i + " ");
            }
        }
    }
}