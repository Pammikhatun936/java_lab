
import java.util.Scanner;

public class AddBinaryNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Removed comment from this line

        System.out.println("Enter First Binary Number :"); 
        String x = sc.next();

        System.out.println("Enter Second Binary Number :"); 
        String y = sc.next();

        // Convert binary strings to integer values
        int n1 = Integer.parseInt(x, 2); 
        int n2 = Integer.parseInt(y, 2); 
        int n3 = n1 + n2;

        // Display the binary values
        System.out.println("n1 = " + Integer.toBinaryString(n1)); 
        System.out.println("n2 = " + Integer.toBinaryString(n2));
        System.out.println("n3 = n1 + n2 = " + Integer.toBinaryString(n3));

        sc.close();
    }
}
