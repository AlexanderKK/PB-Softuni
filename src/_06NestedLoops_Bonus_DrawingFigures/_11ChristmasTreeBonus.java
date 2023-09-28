package _06NestedLoops_Bonus_DrawingFigures;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class _11ChristmasTreeBonus {
    public static void main(String[] args) throws IOException, InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new ChangeToken(), 0 , 750);
    }

    static class ChangeToken extends TimerTask {
        public void run() {
            for (int i = 0; i < 15; i++) {
                System.out.println();
            }

            int n = 20;
            for (int i = 1; i <= n; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            for (int rows = 1; rows <= n; rows++) {
                for (int i = 1; i <= n - rows; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= rows; i++) {
                    int randomNum = (int)(Math.random() * 9) + 1;

                    if(rows >= 12) {
                        if(randomNum > 8) {
                            System.out.print("o");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.print("*");

                for (int i = 1; i <= rows; i++) {
                    int randomNum = (int)(Math.random() * 9) + 1;

                    if(rows >= 12) {
                        if(randomNum > 8) {
                            System.out.print("o");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("mWm");
                System.out.println();
            }
        }
    }
}