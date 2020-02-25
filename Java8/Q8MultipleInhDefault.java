package Java8;

/*
Implement multiple inheritance with default method inside  interface.
*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

interface Parent1{
    default void myMethod(){
        System.out.println("My Method from Parent 1");
    }
}
interface Parent2{
    default void myMethod(){
        System.out.println("My Method from Parent 2");
    }
}

public class Q8MultipleInhDefault implements Parent1, Parent2{

    public Q8MultipleInhDefault(){
        System.out.println("Object Instantiated");
    }

    @Override
    public void myMethod() {
        Parent2.super.myMethod();
        Parent1.super.myMethod();
    }


    public static void main(String[] args) {
        Q8MultipleInhDefault mul = new Q8MultipleInhDefault();
        mul.myMethod();

    }

}
