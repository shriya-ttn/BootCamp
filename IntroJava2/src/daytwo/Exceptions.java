package daytwo;


class school{
    void hi(){
        System.out.println("Hi. I can still run");
    }
}


public class Exceptions {
    public static void main(String[] args) {
        try{

            Class.forName("java.java");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();;
        }
        school emp1 =new school();
        emp1.hi();



    }
}

