import java.util.Scanner;
public class Multiplication_Table
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to print its Multiplication table :");
      int number = sc.nextInt();

      System.out.print("Multiplication Table of " + number + ":");

       for(int i=1; i<=10; i++)
        {
          System.out.println(number+ " x "  + i + " = " +(number * i));    

        }    
  sc.close(); 
    }
}