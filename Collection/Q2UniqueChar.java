package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Q2UniqueChar {


    public static int uniqueCount(String str)
    {
        HashSet<Character> unique = new HashSet<Character>();
        char[] arr= str.toCharArray();
        for (int i=0; i<arr.length; i++)
        {
            unique.add(arr[i]);
        }
        return unique.size() ;
    }

    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(uniqueCount(name));
    }
}
