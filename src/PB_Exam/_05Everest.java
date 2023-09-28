package PB_Exam;

import java.util.Scanner;

public class _05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumMeters = 5364;
        int countDays = 1;
        boolean summitReached = false;

        String command = scanner.nextLine();
        while(!command.equals("END")) {
            String isStaying = command;
            int metersClimbed = Integer.parseInt(scanner.nextLine());

            if(isStaying.equals("Yes")) {
                countDays++;
            }

            if(countDays > 5) {
                break;
            }

            sumMeters += metersClimbed;
            if(sumMeters >= 8848) {
                summitReached = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(summitReached) {
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.println("Failed!");
            System.out.println(sumMeters);
        }
    }
}