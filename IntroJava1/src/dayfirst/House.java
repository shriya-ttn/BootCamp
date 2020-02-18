package dayfirst;

enum Houses {
    Delhi(6000000), Noida(4000000), Gurgaon(7000000);
    private int hprice;

    Houses(int price){
        hprice=price;
    }

    int getPrice(){
        return hprice;
    }
}

public class House{
    public static void main(String[] args) {
        System.out.println("Hosuing List : ");
        for (Houses p: Houses.values()) System.out.println(
                p+ "'s "+"Housing price is : Rs."+ p.getPrice() );
    }
}
