import java.util.Scanner;

public class IntegerReverser {
    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            System.out.print(digit);  // Print the digit
            number /= 10;             // Remove the last digit
        }
        System.out.println();         // Move to the next line after printing
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Reversed number: ");
        reverse(number);
    }
}