import java.util.Scanner;

public class IT24104027Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        double totalCost = pricePerKg * quantityKg;

        // Calculate the discount amount
        double discount = totalCost * 0.1;

        // Calculate the final amount after discount
        double finalAmount = totalCost - discount;

        System.out.println("Total amount to pay before discount: " + totalCost);
        System.out.println("Discount amount: " + discount);
        System.out.println("Final amount to pay after discount: " + finalAmount);

        scanner.close();
    }
}