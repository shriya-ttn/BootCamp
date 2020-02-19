package daytwo;

public class Q12Output {
    public static void main(String[] args) {
        Grandparent g=new Child();
    }}
    class Parent extends Grandparent {
        static {
            System.out.println("static - parent");
        }
        {
            System.out.println("instance - parent");
        }

        public Parent() {
            System.out.println("constructor - parent");
        }
    }

    class Grandparent {

        static {
            System.out.println("static - grandparent");
        }

        {
            System.out.println("instance - grandparent");
        }

        public Grandparent() {
            System.out.println("constructor - grandparent");
        }
    }

    class Child extends Parent {

        public Child() {
            System.out.println("constructor - child");
        }

        static {
            System.out.println("static - child");
        }

        {
            System.out.println("instance - child");
        }
    }
