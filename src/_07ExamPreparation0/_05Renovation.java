package _07ExamPreparation0;

import java.util.Scanner;

public class _05Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notPaintedArea = Integer.parseInt(scanner.nextLine());

        boolean isMore = false;
        boolean isEven = false;

        int litersPaint = 0;
        double totalArea = 0;

        String command = scanner.nextLine();
        while(!command.equals("Tired!")) {
            litersPaint += Integer.parseInt(command);

            int area = height * width * 4;
            double excludedArea = Math.ceil(notPaintedArea / 100.0 * area);
            totalArea = area - excludedArea;

            if(litersPaint > totalArea) {
                isMore = true;
                break;
            } else if(litersPaint == totalArea) {
                isEven = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(isMore) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", litersPaint - totalArea);
        } else if(isEven) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("%.0f quadratic m left.", totalArea - litersPaint);
        }
    }
}