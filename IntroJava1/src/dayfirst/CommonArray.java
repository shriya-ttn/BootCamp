package dayfirst;

import java.util.*;

public class CommonArray {
    public static void main(String args[]) {
        int[] arr1 = {1, 7, 3, 9, 2};
        int[] arr2 = {3, 2, 12, 9, 40, 32, 4};

        System.out.println("Array1 = "+ Arrays.toString(arr1) + "\nArray2 : "+ Arrays.toString(arr2));
        System.out.println("\nCommon elements of both arrays : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}