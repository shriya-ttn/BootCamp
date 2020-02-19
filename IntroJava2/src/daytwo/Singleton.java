package daytwo;

public class Singleton {
    public static void main(String[] args) {
        Abc obj1=Abc.getInstance();
        Abc obj2=Abc.getInstance();
        Abc obj3=Abc.getInstance();


        if(obj1==obj2)
        {
            System.out.println("objects are equal");
        }
    }

}
class Abc{
//   static Abc obj=new Abc(); //by default it is eager

    static Abc obj;   //to create lazy

    private Abc()
    {
        System.out.println("instance created");
    }
    public static Abc getInstance()
    {
        if(obj == null)
            obj = new Abc();
        return obj;
    }
}
