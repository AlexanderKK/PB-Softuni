package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * length;
        boolean noCakeLeft = false;

        String command = scanner.nextLine();
        while(!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);

            cakePieces -= pieces;
            if(cakePieces <= 0) {
                noCakeLeft = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(noCakeLeft) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        } else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}