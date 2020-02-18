package dayfirst;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class OverloadingOps {

    int add(int num1, int num2){
        return num1+num2;
    }

    double add( double num1, double num2){
        return num1+num2;
    }

    int mul(int num1, int num2){
        return num1*num2;
    }

    double mul( double num1, double num2){
        return num1*num2;
    }

    String concat(String s1, String s2){
        return s1+s2;
    }

    String concat(String s1, String s2, String s3){
        return s1+s2+s3;
    }

    public static void main(String[] args){
        OverloadingOps obj = new OverloadingOps();
        /* This time promotion won't happen as there is
         * a method with arg list as (int, float)
         */

        System.out.println("Function Add");
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.0, 20.67));

        System.out.println("\nFunction Multiply");
        System.out.println(obj.mul(10, 20));
        System.out.println(obj.mul(10.0, 20.67));

        System.out.println("\nFunction Concat");
        System.out.println(obj.concat("One", "Two"));
        System.out.println(obj.concat("One", "Two","Three"));

    }

}
