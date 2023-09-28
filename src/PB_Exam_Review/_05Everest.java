package PB_Exam_Review;

import java.util.Scanner;

public class _05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        boolean summitReached = false;
        int days = 1;
        int metersClimbed = 5364;

        while(!command.equals("END")) {
            String stay = command;

            if(stay.equals("Yes")) {
                days++;
            }

            if(days > 5) {
                break;
            }

            metersClimbed += Integer.parseInt(scanner.nextLine());
            if(metersClimbed >= 8848) {
                summitReached = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(summitReached) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", metersClimbed);
        }
    }
}