package _05WhileLoop_Bonus;

import java.util.Scanner;

public class _03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String word = "";
        int countC = 0;
        int countO = 0;
        int countN = 0;

        while(!input.equals("End")) {
            char letter = input.charAt(0);
            boolean isLatin = letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z';

            if(isLatin) {
                if(letter == 'c') {
                    countC++;

                    if(countC > 1) {
                        word += letter;
                    }
                } else if(letter == 'o') {
                    countO++;

                    if(countO > 1) {
                        word += letter;
                    }
                } else if(letter == 'n') {
                    countN++;

                    if(countN > 1) {
                        word += letter;
                    }
                } else {
                    word += letter;
                }
            }

            if(countC >= 1 && countO >= 1 && countN >= 1) {
                System.out.print(word + " ");
                word = "";
                countC = 0;
                countO = 0;
                countN = 0;
            }

            input = scanner.nextLine();
        }
    }
}