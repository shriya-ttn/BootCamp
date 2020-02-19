package daytwo;

import java.util.ArrayList;
import java.util.List;

class Order{
    public int OrderID;
    public int PaymentID;
    void OrderReady(){};
}

interface FoodCounter{
    }

class Cashier extends Order{
    public void setOrderID(int orderID) {
        OrderID = orderID;
    }
    public void setPaymentID(int paymentID) {
        PaymentID = paymentID;
    }

}

class Customer extends Order{

    public int getPaymentID() {
        return PaymentID;
    }

    public int getOrderID() {
        return OrderID;
    }
    void Displaymenu(){}
    void OrderQueueShow(){};
}

class Barista implements FoodCounter{

    void Displaymenu(){
        List<String> menu=new ArrayList<String>();}
    void OrderQueue(){};


    void OrderReady(){};
}

public class Q10CoffeeShop extends Customer {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.OrderQueueShow();
        c.Displaymenu();
    }
}
