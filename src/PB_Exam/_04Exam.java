package PB_Exam;

import java.util.Scanner;

public class _04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int sumBad = 0;
        int sumAverage = 0;
        int sumGood = 0;
        int sumBest = 0;
        double sumGrades = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;

            if(grade >= 2 && grade <= 2.99) {
                sumBad++;
            } else if(grade >= 3 && grade <= 3.99) {
                sumAverage++;
            } else if(grade >= 4 && grade <= 4.99) {
                sumGood++;
            } else {
                sumBest++;
            }
        }

        System.out.printf("Top students: %.2f%%%n", 1.0 * sumBest / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * sumGood / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * sumAverage / students * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 * sumBad / students * 100);
        System.out.printf("Average: %.2f", sumGrades / students);
    }
}