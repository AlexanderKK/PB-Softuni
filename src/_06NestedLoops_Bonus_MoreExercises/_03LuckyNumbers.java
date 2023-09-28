package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                for (int k = 1; k <= 9; k++) {
//                    for (int l = 1; l <= 9; l++) {
//                        if(i + j == k + l && n % (i + j) == 0) {
//                            System.out.printf("%d%d%d%d ", i, j, k, l);
//                        }
//                    }
//                }
//            }
//        }

        for (int i = 1111; i <= 9999; i++) {
            int temp = i;
            int counter = 0;
            int sum1 = 0;
            int sum2 = 0;
            boolean hasZero = false;

            while(temp > 0) {
                counter++;
                int remainder = temp % 10;

                if(remainder == 0) {
                    hasZero = true;
                    break;
                }

                if(counter > 2) {
                    sum1 += remainder;
                } else {
                    sum2 += remainder;
                }
                temp /= 10;
            }

            if(!hasZero && sum1 == sum2 && n % sum1 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}