package PB_Exam_2;

import java.util.Scanner;

public class _05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int metersClimbed = 5364;
        int days = 1;
        boolean isClimbed = false;

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
                isClimbed = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(isClimbed) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.println(metersClimbed);
        }
    }
}