package daytwo;

public class Q13CustomException {
    public static void main(String[] args) {
        try{
            //it will throw and object of user defined exception like what i created customException
            throw new customException("Shriya Garg");
        }
        catch(customException CE){
            System.out.println("I caught an exception");
            CE.printStackTrace();
            //IT WIL SHOW WHAT HAPPEN AND WHERE
        }

    }
}

//To create a custom exception, we have to extend the java.lang.Exception class.
class customException extends Exception{
    customException(String name){
        super(name);
    }
}

