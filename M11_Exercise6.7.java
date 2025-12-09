import java.util.Scanner;

public class InvestmentCalculator {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        int months = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, months);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for investment amount and annual interest rate
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 9 for 9%): ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Display future investment value for years 1 to 30
        System.out.println("\nYears\tFuture Value");
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
            System.out.printf("%d\t%.2f%n", year, futureValue);
        }
    }
}