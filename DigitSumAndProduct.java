public class DigitSumAndProduct {
public static void main(String[] args) {
int number = 1234; // Change this number to test different inputs


int sum = 0;
int product = 1;


int temp = number; while (temp != 0) {
int digit = temp % 10; sum += digit;
product *= digit; temp /= 10;
}
System.out.println("Number: " + number); 
System.out.println("Sum of digits: " + sum); 
System.out.println("Product of digits: " + product);
}
}
