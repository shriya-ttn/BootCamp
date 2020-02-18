package dayfirst;
import java.util.Arrays;

public class RepeatedTwice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,1,2,3,4,6,7,8,9};
        int count=0;
        for (int i=0; i < arr1.length; i++) {
            count=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if (count != 2)
                System.out.println("Element that is not present exactly two times in array \n "+ Arrays.toString(arr1) + "\n is "+arr1[i]);
        }
    }
}
