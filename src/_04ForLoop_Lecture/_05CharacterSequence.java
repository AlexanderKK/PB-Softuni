package _04ForLoop_Lecture;

import java.util.Scanner;

public class _05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}