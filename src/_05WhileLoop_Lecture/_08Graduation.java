package _05WhileLoop_Lecture;

import java.util.*;

public class _08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        boolean isExcluded = false;
        double sumScore = 0;
        int badGrades = 0;

        while(grade <= 12) {
            if(badGrades > 1) {
                isExcluded = true;
                break;
            }

            double score = Double.parseDouble(scanner.nextLine());

            if(score < 4) {
                badGrades++;
                continue;
            }
            grade++;

            sumScore += score;
        }

        if(isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumScore / 12);
        }
    }
}