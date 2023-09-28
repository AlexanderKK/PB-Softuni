package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastNumber = Integer.parseInt(scanner.nextLine());
        int lastChar = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lastNumber; i++) {
            for (int j = 1; j <= lastNumber; j++) {
                int counter1 = 0;

                for (char k = 'a'; k <= 'z'; k++) {
                    int counter2 = 0;

                    for (char l = 'a'; l <= 'z'; l++) {
                        for (int m = 1; m <= lastNumber; m++) {
                            if(m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }

                        counter2++;
                        if(counter2 == lastChar) {
                            break;
                        }
                    }
                    counter1++;
                    if(counter1 == lastChar) {
                        break;
                    }
                }
            }
        }
    }
}