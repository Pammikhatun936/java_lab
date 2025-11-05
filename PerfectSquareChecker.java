public class PerfectSquareChecker {
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false; // Negative numbers are not perfect squares
        }

        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        int number = 16; // Change this number to test different inputs

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
