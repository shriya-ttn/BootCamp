package Java8;

/*
* Write the following a functional interface and implement it using lambda:
(1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
(3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
(4) Convert a string to uppercase and return .                Parameter (String) Return (String)

 */

@FunctionalInterface
interface Compute{
    boolean computeMe(int a, int b); }
  //  boolean computeMee(int a, int b);    }

@FunctionalInterface
interface Increment{
    int incrementMe(int a);
}

@FunctionalInterface
interface Concatenate{
    String concateMe(String a, String b);}

@FunctionalInterface
interface UpperCaseMe{
    String uppMe(String s);
}

public class Q1FuncInterface {
    public static void main(String[] args) {
        Compute comp = (c, d) -> {
            if (c > d) return true;
            else return false;
        };
        System.out.println(comp.computeMe(15, 8));
        System.out.println(comp.computeMe(15, 68));

        System.out.println("====================================");

        Increment incre = (c) -> {
            c += 1;
            System.out.println(c);
            return c;
        };
        incre.incrementMe(4);
        //System.out.println(incre.incrementMe(4));

        System.out.println("====================================");

        Concatenate conc = (s1, s2) -> {
            System.out.println(s1 + s2);
            return s1 + s2;
        };

        conc.concateMe("Shriya", "Garg");

        System.out.println("====================================");
        UpperCaseMe upperCaseMe = (s) -> {
            return s.toUpperCase();
        };

        System.out.println(upperCaseMe.uppMe("Shriya"));
    }
}
