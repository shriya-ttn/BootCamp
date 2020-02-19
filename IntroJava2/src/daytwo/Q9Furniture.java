package daytwo;

public class Q9Furniture {
    public static void main(String[] args) {
        Chair c= new Chair();
        c.stress_test_W();
        c.stress_test_M();
        c.fire_test_M();
        c.fire_test_W();
        System.out.println("-----------");
        Table t= new Table();
        t.stress_test_W();
        t.stress_test_M();
        t.fire_test_M();
        t.fire_test_W();
    }
}

interface wooden {
    void stress_test_W();
    void fire_test_W();
}
interface Metal {
    void stress_test_M();
    void fire_test_M();
}

class Chair extends Q9Furniture implements wooden,Metal{

    @Override
    public void stress_test_W(){
        System.out.println("wooden chair has stress");
    }

    @Override
    public void stress_test_M(){
        System.out.println("wooden chair has stress");
    }

    @Override
    public void fire_test_M(){
        System.out.println("wooden chair has stress");
    }

    @Override
    public void fire_test_W(){
        System.out.println("wooden chair has stress");
    }
}

class Table extends Q9Furniture implements wooden,Metal{
    @Override
    public void stress_test_W(){
        System.out.println("wooden TABLE table has stress");
    }

    @Override
    public void stress_test_M(){
        System.out.println("wooden TABLE has FIRE");
    }

    @Override
    public void fire_test_M(){
        System.out.println("metal TABLE has stress");
    }

    @Override
    public void fire_test_W(){
        System.out.println("wooden TABLE has fire");
    }
}