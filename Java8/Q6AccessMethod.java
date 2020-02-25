package Java8;

/*
* Create and access default and static method of an interface.
 * */

interface myInterface{
    default void displayDefault(){
        System.out.println("Hey, its Default's Display!!");
    }

    static void displayStatic(){
        System.out.println("Hey, its Static's Display!!");
    }
}
public class Q6AccessMethod implements myInterface{
    public static void main(String[] args) {
        myInterface.displayStatic();
      //  myInterface.displayDefault();
        myInterface interfaceReference = new Q6AccessMethod();
        interfaceReference.displayDefault();
    }
}