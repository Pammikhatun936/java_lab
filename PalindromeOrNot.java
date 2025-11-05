
import java.util.Scanner;
public class PalindromeOrNot {

public static void main(String[] args) {
// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter The Number:"); 
int n =sc.nextInt();
int temp=n; int sum =0;
 while(n>0)
{
int ld =n%10;
 sum=sum*10+ld;
 n=n/10;
}
if(sum==temp)
{
System.out.println(temp+ " is a palindrome" );
}else {
System.out.println(temp + " is not a palindrome");
}

}

}
