public class YearDaysCalculator {
    public static int numberOfDaysInAYear(int year) {
        // Leap year if divisible by 4 but not by 100, unless also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        System.out.println("Year\tDays");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "\t" + numberOfDaysInAYear(year));
        }
    }
}