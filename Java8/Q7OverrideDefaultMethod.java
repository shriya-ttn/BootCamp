package Java8;

/*
*  Override the default method of the interface.
*/

interface DefaultDemo{
    default void display(){
        System.out.println("Hi, I'm display's body from  interface");
    }
}

public class Q7OverrideDefaultMethod implements DefaultDemo{
    public void display(){
        System.out.println("Hey, it's me from Class");
    }
    public static void main(String[] args) {
        Q7OverrideDefaultMethod defOver = new Q7OverrideDefaultMethod();
        defOver.display();
    }

}
