package _07ExamPreparation0;

import java.util.Scanner;

public class _06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int a4 = firstNum % 10;          //1367 -> 7
        int a3 = firstNum / 10 % 10;     //1367 / 10 = 136 -> 6
        int a2 = firstNum / 100 % 10;    //1367 / 100 = 13 -> 3
        int a1 = firstNum / 1000 % 10;   //1367 / 1000 = 1 -> 1

        int b4 = secondNum % 10;
        int b3 = secondNum / 10 % 10;
        int b2 = secondNum / 100 % 10;
        int b1 = secondNum / 1000 % 10;

        for (int j = a1; j <= b1; j++) {
            for (int k = a2; k <= b2; k++) {
                for (int l = a3; l <= b3; l++) {
                    for (int m = a4; m <= b4; m++) {
                        if(j % 2 != 0 && k % 2 != 0 && l % 2 != 0 && m % 2 != 0) {
                            System.out.printf("%d%d%d%d ", j, k, l, m);
                        }
                    }
                }
            }
        }
    }
}