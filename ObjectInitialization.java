// Class to represent a Rectangle
class Rectangle {
    int length;
    int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }
}

public class ObjectInitialization {
    public static void main(String[] args) {
        // Create a Rectangle object using reference1
        Rectangle reference1 = new Rectangle(4, 5);

        // Assign reference2 to reference1 (both point to the same object)
        Rectangle reference2 = reference1;

        // Calculate and display area using both references
        System.out.println("Area calculated using reference1: " + reference1.calculateArea());
        System.out.println("Area calculated using reference2: " + reference2.calculateArea());

        // Update length using reference1
        reference1.length = 7;

        // Display updated areas using both references
        System.out.println("Updated area calculated using reference1: " + reference1.calculateArea());
        System.out.println("Updated area calculated using reference2: " + reference2.calculateArea());
    }
}
