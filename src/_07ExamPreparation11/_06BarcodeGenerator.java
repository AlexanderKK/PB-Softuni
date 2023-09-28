package _07ExamPreparation11;

import java.util.Scanner;

public class _06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int startUnits = start / 1000 % 10;
        int startTens = start / 100 % 10;
        int startHundreds = start / 10 % 10;
        int startThousands = start % 10;

        int endUnits = end / 1000 % 10;
        int endTens = end / 100 % 10;
        int endHundreds = end / 10 % 10;
        int endThousands = end % 10;

        String result = "";
        for (int i = startUnits; i <= endUnits; i++) {
            if(i % 2 != 0) {
                for (int j = startTens; j <= endTens; j++) {
                    if(j % 2 != 0) {
                        for (int k = startHundreds; k <= endHundreds; k++) {
                            if(k % 2 != 0) {
                                for (int l = startThousands; l <= endThousands; l++) {
                                    if(l % 2 != 0) {
                                        result += String.format("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result.trim());
    }
}