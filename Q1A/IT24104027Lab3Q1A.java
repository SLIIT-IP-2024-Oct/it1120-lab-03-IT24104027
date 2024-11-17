import java.util.Scanner;

public class IT24104027Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        double totalCost = pricePerKg * quantityKg;

        System.out.println("Total amount to pay: " + totalCost);

        scanner.close();
    }
}