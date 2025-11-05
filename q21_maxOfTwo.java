public class q21_maxOfTwo {
    public static void main(String args[]) {
        // Ensure two command line arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide two integer values as command line arguments.");
            return;
        }
        
        try {
            // Converting String format to Integer value 
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            if (i > j) {
                System.out.println(i + " is greater than " + j);
            } else if (j > i) {
                System.out.println(j + " is greater than " + i);
            } else {
                System.out.println(i + " is equal to " + j);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }
    }
}
