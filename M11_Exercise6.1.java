public class PentagonalNumberCalculator {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        // Example: Print the first 10 pentagonal numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pentagonal number " + i + ": " + getPentagonalNumber(i));
        }
    }
}