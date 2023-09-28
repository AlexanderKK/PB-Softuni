package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int firstDiff = Integer.parseInt(scanner.nextLine());
        int secondDiff = Integer.parseInt(scanner.nextLine());

        int firstPairLimit = firstPair + firstDiff;
        int secondPairLimit = secondPair + secondDiff;

        for (int i = firstPair; i <= firstPairLimit; i++) {
            for (int j = secondPair; j <= secondPairLimit; j++) {
                int counter1 = 0;
                int counter2 = 0;

                for (int k = 1; k <= i; k++) {
                    if(i % k == 0) {
                        counter1++;
                    }
                }

                for (int l = 1; l <= j; l++) {
                    if(j % l == 0) {
                        counter2++;
                    }
                }
                if(counter1 == 2 && counter2 == 2) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }
}