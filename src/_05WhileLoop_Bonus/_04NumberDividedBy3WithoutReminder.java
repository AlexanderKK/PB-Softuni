package _05WhileLoop_Bonus;

public class _04NumberDividedBy3WithoutReminder {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}