package _04ForLoop_Bonus;

import java.util.*;

public class _02Hospital{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; i <= period; i++) {
            int cured = 0;
            int uncured = 0;

            int patients = Integer.parseInt(scanner.nextLine());

            if(i % 3 == 0 && sum1 < sum2) {
                doctors++;
            }
            if(doctors < patients) {
                uncured = patients - doctors;
            }
            cured = patients - uncured;

            sum1 += cured;
            sum2 += uncured;
        }

        System.out.printf("Treated patients: %d.%n", sum1);
        System.out.printf("Untreated patients: %d.", sum2);
    }
}