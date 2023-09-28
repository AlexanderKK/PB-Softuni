package _07ExamPreparation2;

import java.util.Scanner;

public class _04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int excludedArea = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int wallsArea = width * height * 4;
        int area = (int)Math.ceil(wallsArea - excludedArea / 100.0 * wallsArea);
        int liters = 0;
        boolean isEnough = false;
        boolean isMore = false;

        while(!command.equals("Tired!")) {
            liters += Integer.parseInt(command);
            if(liters > area) {
                isMore = true;
                break;
            } else if(liters == area) {
                isEnough = true;
                break;
            }

            command = scanner.nextLine();
        }

        int diff = liters - area;
        if(isMore) {
            System.out.printf("All walls are painted and you have %d l paint left!", diff);
        } else if(isEnough) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("%d quadratic m left.", Math.abs(diff));
        }
    }
}