import java.util.Scanner;
 public class q22_swapNum {
public static void main(String arg[]) {


Scanner input = new Scanner(System.in);


System.out.print("Enter the Value of X: ");
 int x = input.nextInt();

System.out.print("Enter the Value of Y: ");
 int y = input.nextInt();

System.out.println("Before swapping");
 System.out.println("value of x:" + x);
 System.out.println("value of y:" + y);
 System.out.println("After swapping");
 x = x + y;
y = x - y;
x = x - y;
System.out.println("value of x:" + x);
 System.out.println("value of y:" + y);


input.close();
}
}