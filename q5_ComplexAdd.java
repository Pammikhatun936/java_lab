public class q5_ComplexAdd {


double real; double imag;

public q5_ComplexAdd(double real, double imag) { this.real = real;
this.imag = imag;

}


public static void main(String[] args) { q5_ComplexAdd n1 = new q5_ComplexAdd(2.3, 4.5),
n2 = new q5_ComplexAdd(3.4, 5.0), temp;

temp = add(n1, n2);


System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
}

 


 
public static q5_ComplexAdd add(q5_ComplexAdd n1, q5_ComplexAdd n2)

{
q5_ComplexAdd temp = new q5_ComplexAdd(0.0, 0.0); 
temp.real = n1.real + n2.real; temp.imag = n1.imag + n2.imag;


return(temp);
}
}




