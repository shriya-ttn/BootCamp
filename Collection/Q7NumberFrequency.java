package Collection;

/*
Print the elements of an array in the decreasing frequency if 2 numbers
have same frequency then print the one which came first.
*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q7NumberFrequency {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(12);
        integerList.add(2);
        integerList.add(5);
        integerList.add(7);
        integerList.add(7);

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i =0; i<integerList.size(); i++)
        {
            if (map.containsKey(integerList.get(i)))
                map.put(integerList.get(i), map.get(integerList.get(i)) + 1);

            else
                map.put(integerList.get(i), 1);
        }

//        printing the map
        for (Map.Entry entry : map.entrySet())
            System.out.println("Number "+entry.getKey()+" frequency is "+entry.getValue());

    }
}