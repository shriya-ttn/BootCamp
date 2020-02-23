package Collection;

/*Write a method that takes a string and print the number of
 occurrence of each character characters in the string.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3CharCount {

    public static void uniqueCountt(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        ///char[] charArray = text.toCharArray();
        for(Character c : word.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " : " + value));


    }

    public static void main(String[] args) {

        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name+" : ");

        uniqueCountt(name);
    }
}
