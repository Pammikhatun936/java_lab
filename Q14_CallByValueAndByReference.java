class MyClass { 
    int value;

    public MyClass(int value) { 
        this.value = value;
    }
}

public class Q14_CallByValueAndByReference { 
    public static void callByValue(int value) {
        value = 20;
    }

    public static void callByReference(MyClass obj) { 
        obj.value = 20;
    }

    public static void main(String[] args) { 
        int x = 10;
        System.out.println("Before callByValue, x = " + x); 
        callByValue(x);
        System.out.println("After callByValue, x = " + x);

        MyClass obj = new MyClass(10);
        System.out.println("Before callByReference, obj.value = " + obj.value);
        callByReference(obj); 
        System.out.println("After callByReference, obj.value = " + obj.value);
    }
}
