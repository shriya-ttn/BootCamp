package daytwo;

public class TryCatch {
    public static void main(String[] args) {
        int x=10,y=20,z=30;
        try{
            if(1==0){
                System.out.println("x is 10");
            }
            int b=x/0;
            System.out.println(b);
        }

        catch (NumberFormatException e){
            System.out.println("NumberFormatException has occured");
        }

        catch(ArithmeticException e){
            System.out.println("ArithmeticException has occured");
        }

        finally{
            int a=x+y+z;
            System.out.println("Using finally : "+a);
        }
    }
}

