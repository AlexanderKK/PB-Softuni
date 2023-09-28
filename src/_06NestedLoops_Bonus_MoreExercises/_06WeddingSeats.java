package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int sectorRows = Integer.parseInt(scanner.nextLine());
        int seatsOnOddRow = Integer.parseInt(scanner.nextLine());
        int seats = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= sectorRows; j++) {
                int currentSeats;
                if(j % 2 == 0) {
                    currentSeats = seatsOnOddRow + 2;
                } else {
                    currentSeats = seatsOnOddRow;
                }

                for (char k = 'a'; k <= 'z'; k++) {
                    if(currentSeats > 0) {
                        System.out.printf("%c%d%c%n", i, j, k);
                        currentSeats--;
                        seats++;
                    } else {
                        break;
                    }
                }
            }
            sectorRows++;
        }
        System.out.println(seats);
    }
}