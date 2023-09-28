package _07ExamPreparation4;

import java.util.Scanner;

public class _06FavouriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String maxMovie = "";
        int max = 0;
        int counter = 0;
        boolean isReached = false;

        while(!command.equals("STOP")) {
            int sum = 0;
            String title = command;
            for (int i = 0; i < title.length(); i++) {
                sum += title.charAt(i);
                if(title.charAt(i) >= 65 && title.charAt(i) <= 90) {
                    sum -= title.length();
                } else if(title.charAt(i) >= 97 && title.charAt(i) <= 122){
                    sum -= 2 * title.length();
                }
            }
            if(sum > max) {
                max = sum;
                maxMovie = title;
            }

            counter++;
            if(counter == 7) {
                isReached = true;
                break;
            }
            command = scanner.nextLine();
        }

        if(isReached) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", maxMovie, max);
    }
}