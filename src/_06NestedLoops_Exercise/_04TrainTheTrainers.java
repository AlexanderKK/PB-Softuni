package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumAllGrades = 0;
        int gradeCount = 0;

        while (!command.equals("Finish")) {
            String presentation = command;
            double sumCurrentGrade = 0;

            for (int i = 0; i < judges ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumCurrentGrade += grade;
                sumAllGrades += grade;
                gradeCount++;
            }
            double averageCurrentGrade = sumCurrentGrade / judges;
            System.out.printf("%s - %.2f.%n", presentation, averageCurrentGrade);

            command = scanner.nextLine();
        }
        double averageGrade = sumAllGrades / gradeCount;
        System.out.printf("Student's final assessment is %.2f.", averageGrade);
    }
}