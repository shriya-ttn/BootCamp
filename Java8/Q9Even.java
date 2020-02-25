package Java8;

/*
* Collect all the even numbers from an integer list.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9Even {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 15, 45, 23, 17, 18, 14, 16);
        System.out.println(
                integerList
                .stream()
                .filter((e)-> e%2==0)
                .collect(Collectors.toList())
        );
    }
}
