package _06NestedLoops_Lecture;

import java.util.Scanner;

public class _06Building {
    public static class A {
         public void sort() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(10 - i);
            }

            for (int i = 0; i < "WELCOME".length(); i++) {
                System.out.print("WELCOME".charAt("WELCOME".length() - i - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.sort();

        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int roomsPerFloor = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= floors; i++) {
            int temp = i;
            i = floors - i + 1;

            for (int j = 0; j < roomsPerFloor; j++) {
                if(i == floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if(i % 2 != 0) {
                    System.out.printf("A%d%d ", i, j);
                } else {
                    System.out.printf("O%d%d ", i, j);
                }
            }
            i = temp;

            System.out.println();
        }
    }
}