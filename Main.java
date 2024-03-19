import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miejsce: ");
        String city = scan.next();
        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();
        System.out.println("Dzisiaj jest Czwartek?(true/false): ");
        boolean thursday = scan.nextBoolean();
        double price = calculateTicketPrice(city, age, thursday);
        System.out.println("Data: " + city + ", " + age + " years old, " + (thursday ? "Thursday" : "Not Thursday"));
        System.out.println("Ticket price: " + price + " PLN");
    }

    public static double calculateTicketPrice(String city, int age, boolean isThursday) {
        double price = 40.0;

        if (isThursday) {
            return 0.0;
        }

        if (age < 10) {
            return 0.0;
        } else if (age >= 10 && age <= 18) {
            price *= 0.5;
        }

        if (city.equalsIgnoreCase("warsaw") || city.equalsIgnoreCase("warszawa")) {
            price *= 0.9;
        }

        return price;
    }
}