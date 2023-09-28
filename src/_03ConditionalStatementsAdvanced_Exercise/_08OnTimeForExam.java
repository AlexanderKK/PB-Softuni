package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _08OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int timeExam = hourExam * 60 + minuteExam;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        int diff = Math.abs(timeExam - arrivalTime);

        boolean isEarly = false;
        boolean isLate = false;

        if(arrivalTime > timeExam) {
            System.out.println("Late");
            isLate = true;
        } else if(arrivalTime == timeExam || diff <= 30) {
            System.out.println("On time");

            if(diff >= 1) {
                isEarly = true;
            }
        } else {
            System.out.println("Early");
            isEarly = true;
        }

        int hours = diff / 60;
        int minutes = diff % 60;

        if(isEarly) {
            if(diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }

        if(isLate) {
            if(diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }
    }
}