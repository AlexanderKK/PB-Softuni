package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                maxTables--;

                if(maxTables == 0) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                break;
            }
        }
    }
}