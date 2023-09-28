package _04ForLoop_Bonus;

import java.util.Scanner;

public class _04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int goodStudents = 0;
        int badStudents = 0;
        int failedStudents = 0;
        double sumGrades = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if(grade >= 5 && grade <= 6) {
                topStudents++;
            } else if(grade >= 4) {
                goodStudents++;
            } else if(grade >= 3) {
                badStudents++;
            } else {
                failedStudents++;
            }

            sumGrades += grade;
        }

        double top = topStudents / (students * 1.0) * 100;
        double good = goodStudents / (students * 1.0) * 100;
        double bad = badStudents / (students * 1.0) * 100;
        double failed = failedStudents / (students * 1.0) * 100;

        double average = sumGrades / students;

        System.out.printf("Top students: %.2f%%%n", top);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", good);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", bad);
        System.out.printf("Fail: %.2f%%%n", failed);
        System.out.printf("Average: %.2f%n", average);
    }
}