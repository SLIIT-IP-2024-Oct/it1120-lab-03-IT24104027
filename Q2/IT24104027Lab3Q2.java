import java.util.Scanner;

public class IT24104027Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double otRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        System.out.println("Total salary: " + totalSalary);

        scanner.close();
    }
}