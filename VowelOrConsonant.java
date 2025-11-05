import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter The Character: "); 
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println(ch + " Is Vowel");
                break;
            case 'e':
                System.out.println(ch + " Is Vowel");
                break;
            case 'i':
                System.out.println(ch + " Is Vowel");
                break;
            case 'o':
                System.out.println(ch + " Is Vowel");
                break;
            case 'u':
                System.out.println(ch + " Is Vowel");
                break;
            case 'A':
                System.out.println(ch + " Is Vowel");
                break;
            case 'E':
                System.out.println(ch + " Is Vowel");
                break;
            case 'I':
                System.out.println(ch + " Is Vowel");
                break;
            case 'O':
                System.out.println(ch + " Is Vowel");
                break;
            case 'U':
                System.out.println(ch + " Is Vowel");
                break;
            default:
                System.out.println(ch + " Is Consonant");
        }
        sc.close();
    }
}
