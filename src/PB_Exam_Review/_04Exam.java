package PB_Exam_Review;

import java.util.Scanner;

public class _04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int sumExcellent = 0;
        int sumGood = 0;
        int sumAverage = 0;
        int sumBad = 0;
        double sumGrades = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;

            if(grade >= 5 && grade <= 6) {
                sumExcellent++;
            } else if(grade >= 4) {
                sumGood++;
            } else if(grade >= 3) {
                sumAverage++;
            } else {
                sumBad++;
            }
        }

        System.out.printf("Top students: %.2f%%%n", sumExcellent * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", sumGood * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", sumAverage * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", sumBad * 1.0 / students * 100);
        System.out.printf("Average: %.2f%n", sumGrades / students);
    }
}