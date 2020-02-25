package Java8;

/*
* Create a functional interface whose method takes 2 integers and return one integer.
 */

@FunctionalInterface
interface CalculateSum{
    int calcMe(int c, int d);
}

public class Q2FunctionalTwo2One {
    //FI Method
    public static void main(String[] args) {
        CalculateSum calc= (a,b)->{
            System.out.println(a+b);
            return a+b;};

    calc.calcMe(3,7);

    }}
