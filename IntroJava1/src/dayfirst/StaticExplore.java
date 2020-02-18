package dayfirst;

public class StaticExplore {


    static String fname;
    static String lname;
    static int age;

    static{
        fname= "Shriya";
        lname= "Garg";
        age = 21;
        System.out.println("STATIC BLOCK is called");
    }

    static void showData(){
        System.out.println("STATIC METHOD is called");
        System.out.println(lname);
    }

    public static void main(String[] args) {
        System.out.println(StaticExplore.fname);
        showData();
        System.out.println("STATIC VARIABLES is called\n"+age);

    }
}
