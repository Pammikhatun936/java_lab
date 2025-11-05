class Parent {
public final void display() {
System.out.println("This is the final method in the Parent class.");
}

}


class Child extends Parent {
// Uncomment the following code to see the compilation error
// @Override
// public void display() {
//	System.out.println("This is the overridden method in the Child class.");
// }

}


public class q48_final_method {
public static void main(String[] args) { 
Parent parent = new Parent();
parent.display(); // Calls the final method in the Parent class


 




 
Child child = new Child();
child.display(); // Inherited final method from the class

}
}