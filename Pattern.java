
import java.util.Scanner;
public class Pattern {

public static void main(String[] args) {
// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
System.out.println("Enter The Value Of N :");
int n =sc.nextInt();
for(int i=1;i<=n;i++)
{
int count =1;
for(int j=1;j<=n-i+1;j++)
{
System.out.print(count +" ");
 count++;
}
for(int j=1;j<=2*i-2;j++)
{
System.out.print("*"+" ");
}
for(int j=n-i+1;j>=1;j--)
{
System.out.print(j+" ");
}
System.out.println();
 sc.close();
}

}

}
