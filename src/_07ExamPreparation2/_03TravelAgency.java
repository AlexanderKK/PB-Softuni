package _07ExamPreparation2;

import java.util.Scanner;

public class _03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packet = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        boolean wrongCityPacket = false;
        boolean noDays = false;

        if(!city.equals("Bansko") && !city.equals("Borovets") && !city.equals("Varna") && !city.equals("Burgas") || !packet.equals("noEquipment") && !packet.equals("withEquipment") && !packet.equals("noBreakfast") && !packet.equals("withBreakfast")) {
            wrongCityPacket = true;
        } else if(days < 1) {
            noDays = true;
        }

        double price = 0;
        if(city.equals("Bansko") || city.equals("Borovets")) {
            if(packet.equals("withEquipment")) {
                price = 100;

                if(VIP.equals("yes")) {
                    price *= .9;
                }
            } else if(packet.equals("noEquipment")) {
                price = 80;

                if(VIP.equals("yes")) {
                    price *= .95;
                }
            }
        } else if(city.equals("Varna") || city.equals("Burgas")) {
            if(packet.equals("withBreakfast")) {
                price = 130;

                if(VIP.equals("yes")) {
                    price *= .88;
                }
            } else if(packet.equals("noBreakfast")) {
                price = 100;

                if(VIP.equals("yes")) {
                    price *= .93;
                }
            }
        }

        if(days > 7) {
            days--;
        }
        double totalCost = price * days;

        if(wrongCityPacket) {
            System.out.println("Invalid input!");
        } else if(noDays) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", totalCost);
        }
    }
}