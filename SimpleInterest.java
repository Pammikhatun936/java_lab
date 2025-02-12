
import java.util.Scanner;
public class SimpleInterest {
        public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter The Value Of principal (P): ");
       int P =sc.nextInt();
       System.out.println("Enter The value of Interest Rate (R): ");
       float R =sc.nextFloat();
       System.out.println("Enter The Value Of Time-Duration (T): ");
        int T =sc.nextInt();
       float S_I =(P*R*T)/100;
       System.out.println("The Simple Interest is: "+S_I);
       sc.close();
}
}