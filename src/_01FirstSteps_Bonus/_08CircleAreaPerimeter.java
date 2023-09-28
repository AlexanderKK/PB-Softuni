package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _08CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f%n", circumference);
    }
}