package daytwo;

public class Clone {
    int a,b,c;

    public Clone(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Clone(Clone c){
        a=c.a;
        b=c.b;
    }

}
class copy{
    public static void main(String[] args) {
        Clone c= new Clone(1,2,3);
        Clone c1= new Clone(c);
        System.out.println("Copy of object c in c1 is : "+c1.a+" "+c1.b+ " "+ c.b);
    }
}