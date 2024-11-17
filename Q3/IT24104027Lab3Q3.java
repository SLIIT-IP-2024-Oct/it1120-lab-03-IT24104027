import java.util.Scanner;

public class IT24104027Lab3Q3 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the amount in rupees
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        // Denominations of notes and coins
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Loop through each denomination and calculate the number of notes/coins
        for (int denom : denominations) {
            // Calculate how many notes/coins of this denomination
            int count = amount / denom;
            if (count >= 0) {
                System.out.println("Number of " + denom + "/- notes/coins: " + count);
            }
            // Reduce the amount by the number of notes/coins used
            amount %= denom;
        }

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
