package _04ForLoop_Exercise;

import java.util.Scanner;

class _06Oscars {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        boolean isNominated = false;
        for(int i = 0; i < judges; i++) {
            String name = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());

            points += currentPoints * name.length() / 2;

            if(points > 1250.5) {
                isNominated = true;
                break;
            }
        }

        if(isNominated){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
        } else {
            double diff = 1250.5 - points;
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}