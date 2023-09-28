package _07ExamPreparation7;

import java.util.Scanner;

public class _06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightGoal = Integer.parseInt(scanner.nextLine());

        int jumps = 3;   //Брой опита
        int jumpCounter = 0;   //Брой скока
        int slatHeight = heightGoal - 30;   //Височина на летва
        boolean isSucceeded = false;

        while (jumps > 0) {
            int heightJump = Integer.parseInt(scanner.nextLine());   //Нов опит
            jumpCounter++;

            if (slatHeight >= heightGoal && heightJump > slatHeight) {
                isSucceeded = true;
                break;
            }

            if (heightJump > slatHeight) {   //Ако Тихомир успее да прескочи летвата
                slatHeight += 5;   //Вдигаме летвата с 5см
                jumps = 3;   //Нови 3 опита
            } else {
                jumps--;   //Оставаме без 1 опит за скок
            }
        }

        if (isSucceeded) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", slatHeight, jumpCounter);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", slatHeight, jumpCounter);
        }
    }
}