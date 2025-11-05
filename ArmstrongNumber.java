
import java.util.Scanner;
public class ArmstrongNumber {

public static void main(String[] args) {
// TODO Auto-generated method stub 
Scanner sc =new Scanner(System.in); 
System.out.println("Enter The Number:"); 
int n =sc.nextInt();
int an=0; int temp=n; 
while(n>0)
{
int ld =n%10;
 an=an+(ld*ld*ld);
 n=n/10;
}
if(an==temp)
{ 



 
System.out.println(temp+" is a armstrong number");
}else{
System.out.println(temp+" is not a armstrong number");

}
sc.close();

}

}

