package Collection;

/*
* Write Java code to define List . Insert 5 floating point numbers
*  in List, and using an iterator, find the sum of the numbers in List.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1ListIterator {
    public static void main(String[] args) {


        List<Float> arrayList = new ArrayList<Float>();

        arrayList.add(1.2f);
        arrayList.add(6.7f);
        arrayList.add(9.6f);
        arrayList.add(3.5f);
        arrayList.add(8.4f);

        float sum = 0;
        Iterator itr = arrayList.iterator();

//        System.out.println("Iterating through ArrayList elements...");
//        while (itr.hasNext())
//            System.out.println(itr.next());

        while (itr.hasNext()){
            //sum = sum+ (float)itr.next();
            sum =Float.sum(sum, (float) itr.next());
        }
        System.out.print("Sum : "+sum);
    }
}
