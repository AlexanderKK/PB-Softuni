package _07ExamPreparation9;

import java.util.Scanner;

public class _04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsPlayer1 = Integer.parseInt(scanner.nextLine());
        int eggsPlayer2 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean areBroken = false;

        while(!input.equals("End")) {
            String winner = input;
            if(winner.equals("one")) {
                eggsPlayer2--;
            } else if(winner.equals("two")) {
                eggsPlayer1--;
            }

            if(eggsPlayer1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsPlayer2);
                areBroken = true;
                break;
            } else if(eggsPlayer2 == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsPlayer1);
                areBroken = true;
                break;
            }

            input = scanner.nextLine();
        }

        if(!areBroken) {
            System.out.printf("Player one has %d eggs left.%n", eggsPlayer1);
            System.out.printf("Player two has %d eggs left.", eggsPlayer2);
        }
    }
}