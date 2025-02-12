import java.util.Scanner;
public class QuotientAndReminder {
     public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter The Dividend value:");
    int D =sc.nextInt();
    System.out.println("Enter The Divisor value:"); 
    int d =sc.nextInt();
     int reminder = D%d;
     int quotient =D/d;
     System.out.println("the value of quotient is "+quotient+" and reminder is "+reminder);
     sc.close();
}
}