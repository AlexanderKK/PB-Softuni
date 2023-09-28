package UE_VarnaCompetition;

import java.util.Scanner;

public class _01Maya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bees;
        int a = 0;
        int b = 0;
        int c = 0;

        String line = scanner.nextLine();
        bees = line.split(" ");
        a = Integer.parseInt(bees[0]);
        b = Integer.parseInt(bees[1]);
        c = Integer.parseInt(bees[2]);

        if(a <= b && b <= c && a + b + c > 0) {
            System.out.println(c - a);
        }
    }
}