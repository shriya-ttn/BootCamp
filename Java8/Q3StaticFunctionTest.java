package Java8;

//3. Using (instance) Method reference create and apply add and subtract method and using (Static) Method
// reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface Interf1{
    int interfaceMethod(int a, int b);
}

class MyClass{
    int add(int a, int b){
        return a+b;
    }

    int subtract(int a, int b)
    {
        return a-b;
    }

    static int multiply(int a, int b)
    {
        return a*b;
    }
}

public class Q3StaticFunctionTest {
    public static void main(String[] args) {
        //Method Reference class method
        Interf1 interface1 = new MyClass()::add;
        System.out.println("Adding 7 and 8 :: "+interface1.interfaceMethod(7,8));
        interface1 = new MyClass()::subtract;
        System.out.println("Subtracting 7 and 8 :: "+interface1.interfaceMethod(7, 8));
        interface1=MyClass::multiply;
        System.out.println("Multiplying 7 and 8 :: "+interface1.interfaceMethod(7, 8));
    }
}
