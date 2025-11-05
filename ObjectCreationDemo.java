// Class to represent a Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreationDemo {
    public static void main(String[] args) {
        // Creating an object of the Person class using the constructor
        Person person = new Person("John Doe", 30);

        // Invoking the displayInfo() method on the object
        person.displayInfo();
    }
}
