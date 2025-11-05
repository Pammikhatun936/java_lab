public class q36_local_instances_static_variable {
// Static variable
static int staticVariable = 10;


// Instance variable
int instanceVariable = 20;


public void method() {
// Local variable
int localVariable = 30;

System.out.println("Static variable: " + staticVariable);
 System.out.println("Instance variable: " + instanceVariable);
System.out.println("Local variable: " + localVariable);

}

public static void main(String[] args) {
 q36_local_instances_static_variable demo = new
q36_local_instances_static_variable();
 demo.method();
}
}