package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        for (int i = 1111; i <= 9999; i++) {
//            boolean isNotSpecial = false;
//            int temp = i;
//            while(temp > 0) {
//                int remainder = temp % 10;
//
//                if(remainder == 0 || n % remainder != 0) {
//                    isNotSpecial = true;
//                    break;
//                }
//                temp /= 10;
//            }
//            if(!isNotSpecial) {
//                System.out.print(i + " ");
//            }
//        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if(n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}