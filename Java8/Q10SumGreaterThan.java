package Java8;

/*
*Sum all the numbers greater than 5 in the integer list.
*/

import java.util.Arrays;
import java.util.List;

public class Q10SumGreaterThan {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 5, 13, 14, 12, 25, 25, 31);
        int sum = integerList
                .stream()
                .filter((e)-> e>5)
                .reduce(0, (a,b)-> a+b);
        System.out.println("Required sum is : " + sum);
    }
}
