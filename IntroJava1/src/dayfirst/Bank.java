package dayfirst;

public class Bank {

    protected String Bname;
    protected int Roi;

    public Bank(){
        Bname = "Default";
        Roi= 0;
    }

    public void getDetails(){
        System.out.println("Bank Name: " + Bname);
        System.out.println("Rate of Interest: "+ Roi);
    }

}

    class SBI extends Bank {
        public SBI() {
            Bname = "SBI";
            Roi = 6;
        }

        public void getDetails() {
            System.out.println("");
            System.out.println("Bank Name: " + Bname);
            System.out.println("Rate of Interest: " + Roi);
        }
    }

    class BOI extends Bank {
        public BOI() {
            Bname = "BOI";
            Roi = 7;
        }

        public void getDetails() {
            System.out.println("");
            System.out.println("Bank Name: " + Bname);
            System.out.println("Rate of Interest: " + Roi);
        }
    }
    class ICICI extends Bank {
        public ICICI() {
            Bname = "ICICI";
            Roi = 8;
        }

        public void getDetails() {
            System.out.println("");
            System.out.println("Bank Name: " + Bname);
            System.out.println("Rate of Interest: " + Roi);
        }
    }
class Caller {
    public static void main(String[] args) {
        Bank d=new Bank();
        Bank b = new BOI();
        Bank s = new SBI();
        Bank i = new ICICI();
        d.getDetails();
        b.getDetails();
        s.getDetails();
        i.getDetails();
    }
}


