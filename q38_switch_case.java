import java.util.Scanner;
 public class q38_switch_case {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the choice: ");
 int choice= sc.nextInt();
switch (choice) { 
case 1:
System.out.println("You chose option 1.");
break;
case 2:
System.out.println("You chose option 2.");
break;
case 3:
System.out.println("You chose option 3.");
break;
default:
System.out.println("Invalid choice."); 
break;
}
}
}
