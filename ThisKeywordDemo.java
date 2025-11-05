public class ThisKeywordDemo {
 private String name;


public ThisKeywordDemo(String name) {
 this.name = name;
}
public void printName() {
 String name = "Local Name";
System.out.println("Local Name: " + name);
 System.out.println("Instance Name: " + this.name);
}


public static void main(String[] args) { 
ThisKeywordDemo obj = new ThisKeywordDemo("John");
 obj.printName();
}
}
