    package _07ExamPreparation7;

    import java.util.Scanner;

    public class _01TennisEquipment {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double priceRackets = Double.parseDouble(scanner.nextLine());
            int rackets = Integer.parseInt(scanner.nextLine());
            int trousers = Integer.parseInt(scanner.nextLine());

            double priceTrousers = priceRackets / 6;
            double sum = priceTrousers * trousers + priceRackets * rackets;
            double totalEquipment = sum * 0.2;

            double overAllPrice = sum + totalEquipment;

            System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(overAllPrice / 8));
            System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(overAllPrice * 7 / 8));
        }
    }