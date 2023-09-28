package _02ConditionalStatements_Lecture;

import java.util.Scanner;

public class _07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
//        char figure[] = scanner.nextLine().toCharArray();

        boolean isSquare = false;
        boolean isRectangle = false;
        boolean isCircle = false;
        boolean isTriangle = false;

        double area = 0;

        if(figure.equals("square")) {
            isSquare = true;
        }
        else if(figure.equals("rectangle")) {
            isRectangle = true;
        }
        else if(figure.equals("circle")) {
            isCircle = true;
        }
        else if(figure.equals("triangle")) {
            isTriangle = true;
        }

        if(isSquare) {
            double a = Double.parseDouble(scanner.nextLine());

            area = a * a;
        }
        else if(isRectangle) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            area = a * b;
        }
        else if(isCircle) {
            double r = Double.parseDouble(scanner.nextLine());

            area = Math.PI * Math.pow(r, 2);
        }
        else if(isTriangle) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = a * h / 2;
        }

        System.out.printf("%.3f%n", area);
    }
}