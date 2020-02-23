package Collection;

/*
Print the elements of an array in the decreasing frequency if 2 numbers
have same frequency then print the one which came first.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q7NumberFrequency {
    public static StringBuffer sortByFrequency(int arr1[], int l1) {
        // Build a map of array elements to its count
        Map<Integer, Integer> countMap = getCountMap(arr1, l1);
        StringBuffer result = new StringBuffer();

        // Sort the map using a comparingByValue comparator
        // build the result by appending keys the count times to the result

        countMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed())
                .forEach(e -> {
                    int key = e.getKey();
                    int val = e.getValue();
                    for (int i = 0; i < val; i++) {
                        result.append(key + " ");
                    }
                });

        return result;
    }

    // helper function to return the element count map
    private static Map<Integer, Integer> getCountMap(int[] arr, int l1) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < l1; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        return countMap;
    }

    // Driver program
    public static void main(String[] args) throws IOException {
        int a[] = { 2, 5, 2, 6, -1, 99, 5, 8, 8, 8 };
        System.out.println(sortByFrequency(a, a.length));
    }
}