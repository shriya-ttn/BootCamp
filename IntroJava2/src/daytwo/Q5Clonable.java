package daytwo;
import java.sql.SQLOutput;

class Emp implements Cloneable{
String name;
int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 public class Q5Clonable implements Cloneable{
     public static void main(String[] args) {
         try{
             Emp e=new Emp("Shriya",101);
             Emp e1=(Emp)e.clone();
             System.out.println("Employee name is:"+e1.name+"  "+"Employee id is:"+e1.id);

         }
         catch(CloneNotSupportedException c ){
             c.printStackTrace();
         }
     }
 }
