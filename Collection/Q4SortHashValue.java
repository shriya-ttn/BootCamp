package Collection;

/* Write a program to sort HashMap by value.
 */

import java.util.*;
import java.util.Comparator;

public class Q4SortHashValue {


    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args)
    {
        System.out.println("Original HashMap \n");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Abc", 95);
        hm.put("Database", 41);
        hm.put("Java", 100);
        hm.put(" System", 79);

        for (Map.Entry<String, Integer> en : hm.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ": Value = " + en.getValue());
        }

        System.out.println("\n====================================");
        System.out.println("Sorted Hashmap by values\n");

        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ": Value = " + en.getValue());
        }
    }



  /*  public static HashMap<String, Integer> sortbyValue(HashMap<String,Integer> hmap){

        List<HashMap.Entry<String, Integer>> list = new LinkedList<HashMap.Entry<String,Integer>>(hmap.entrySet());

        Comparator<HashMap.Entry<String, String>> valueComparator = new Comparator<HashMap.Entry<String,String>>() {
            @Override
            public Comparator<HashMap.Entry<String, String>> thenComparingInt(ToIntFunction<? super HashMap.Entry<String, String>> keyExtractor) {
                return null;
            }

//            //  Collections.sort(list, new Comaparator<HashMap.Entry<String,Integer>>() {
//            public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2) {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }*/
}


