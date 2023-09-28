package _07ExamPreparation13;

import java.util.Scanner;

public class _05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rackCapacity = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        double thirdPercentage = 0;
        boolean isBigger = false;
        double sumVolume = 0;

        String command = scanner.nextLine();
        while(!command.equals("End")) {
            double luggageVolume = Double.parseDouble(command);
            counter++;
            if(counter % 3 == 0) {
//                thirdPercentage += 0.1;
//                luggageVolume += luggageVolume * thirdPercentage;
                luggageVolume *= 1.1;
            }
            rackCapacity -= luggageVolume;

            if(rackCapacity < 0) {
                counter--;
                isBigger = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(isBigger) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}