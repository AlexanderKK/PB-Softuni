package _04ForLoop_Exercise;

import java.util.Scanner;

public class _05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean hasLostSalary = false;

        for (int i = 0; i < tabs; i++) {
            String site = scanner.nextLine();

            if ("Facebook".equals(site)) {
                salary -= 150;
            } else if ("Instagram".equals(site)) {
                salary -= 100;
            } else if ("Reddit".equals(site)) {
                salary -= 50;
            }

            if(salary <= 0) {
                hasLostSalary = true;
                break;
            }
        }

        if(hasLostSalary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}