
import java.util.Scanner;
public class FibonacciSeries {

public static void main(String[] args) {
// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in); 
System.out.println("Enter The Number: ");
 int n = sc.nextInt();
int a=0; int b=1; int sum=0;
for(int i=1;i<=n;i++)
{
System.out.print(a+" "); 
sum=a+b;
a=b;
b=sum;
}
sc.close();
}

}
