package Java8;

/*Q12
* Find the first even number in the integer list which is greater than 3.
 * */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q12FirstEvenGreaterThanThree {
    public static void main(String[] args) {
        List<Integer> intlistt = Arrays.asList(3,2,5,1,7 ,6,9,12,45,2);
        Optional<Integer> eveG = intlistt
                    .stream()
                    .filter((e)->e%2==0)
                    .filter((e)->e>3)
                    .findFirst();
        if(eveG.isPresent())
            System.out.println("Required Integer is : " + eveG);
        else
            System.out.println("No such integer present");

    }
}
