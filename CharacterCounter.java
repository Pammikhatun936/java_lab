public class CharacterCounter {
public static void main(String[] args) {
String str = "Second"; // Change this string to test different inputs


int characterCount = countCharacters(str);


System.out.println("The number of characters in the string " + str + " is: " + characterCount);
}


public static int countCharacters(String str) {
 int count = 0;
char[] charArray = str.toCharArray();


for (int i = 0; i < charArray.length; i++) {
 count++;
}


return count;
}
}
