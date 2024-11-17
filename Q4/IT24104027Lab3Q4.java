import java.util.Scanner;

public class IT24104027Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Extract each digit using integer division and modulo operations
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        // Print the separated digits
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

        scanner.close();
    }
}