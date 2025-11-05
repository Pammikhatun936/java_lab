import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix size input
        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculating minor diagonal sum
        int minorDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            minorDiagonalSum += matrix[i][n - i - 1];
        }

        // Output result
        System.out.println("Sum of Minor Diagonal: " + minorDiagonalSum);

        sc.close();
    }
}
