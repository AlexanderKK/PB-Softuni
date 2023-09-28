package _04ForLoop_Lecture;

import java.util.Scanner;

public class _03Nums1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}