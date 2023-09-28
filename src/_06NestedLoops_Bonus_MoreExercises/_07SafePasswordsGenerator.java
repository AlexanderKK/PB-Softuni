package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        int k = 35;
        int l = 64;
        boolean hasEnded = false;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(maxPasswords == 0) {
                    hasEnded = true;
                    break;
                }

                if(k == 56) {
                    k = 35;
                }
                char A = (char)k;

                if(l == 97) {
                    l = 64;
                }
                char B = (char)l;

                System.out.printf("%c%c%d%d%c%c|", A, B, i, j, B, A);

                k++;
                l++;
                maxPasswords--;
            }

            if(hasEnded) {
                break;
            }
        }
    }
}