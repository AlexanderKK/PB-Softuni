package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _08PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isBorder = false;
//        if (x == x1 || x == x2 && y >= y1 && y <= y2) {
//            isBorder = true;
//        } else if (y == y1 || y == y2 && x >= x1 && x <= x2) {
//            isBorder = true;
//        }

        if (x == x1 || x == x2 || y == y1 || y == y2) {
            if(y >= y1 && y <= y2 && x >= x1 && x <= x2) {
                isBorder = true;
            }
        }

        if(isBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}