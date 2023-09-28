package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int emptySpace = width * length * height;
        String input = scanner.nextLine();
        int boxesSpace = 0;
        boolean noSpace = false;

        while(!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            boxesSpace += boxes;

            if(boxesSpace > emptySpace) {
                noSpace = true;
                break;
            }

            input = scanner.nextLine();
        }

        int diff = Math.abs(boxesSpace - emptySpace);
        if(noSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}