package Java8;

/*Q11
* Find average of the number inside integer list after doubling it.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q11AverageDouble {
    public static void main(String[] args) {
        List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,7);
        Double avgg =intlist
                      .stream()
                      .collect(Collectors.averagingInt((e)->e*2));
        System.out.println(avgg);
    }
}
