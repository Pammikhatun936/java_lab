import java.util.Scanner;
public class Multiplication_Q1 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a first number:");
      int num1 = sc.nextInt();

      System.out.print("Enter a second number:");
      int num2 = sc.nextInt();

      int mul = num1 * num2;
      System.out.print("Multiplication of " + num1 + " and " + num2 + " is: " +mul);
      sc.close(); 
    }
}