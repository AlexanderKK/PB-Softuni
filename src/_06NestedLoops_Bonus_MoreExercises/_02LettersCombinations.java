package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char lastLetter = scanner.nextLine().charAt(0);
        char excludedLetter = scanner.nextLine().charAt(0);

        int counter = 0;
        for (int i = firstLetter; i <= lastLetter; i++) {
            if(excludedLetter != i) {
                for (int j = firstLetter; j <= lastLetter; j++) {
                    if(excludedLetter != j) {
                        for (int k = firstLetter; k <= lastLetter; k++) {
                             if(excludedLetter != k) {
                                counter++;
                                System.out.printf("%c%c%c ", i, j, k);
                            }
                        }
                    }
                }
            }
        }
        System.out.print(counter);
    }
}