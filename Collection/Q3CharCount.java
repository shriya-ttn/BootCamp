package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3CharCount {

    public static void uniqueCountt(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        ///char[] charAarry = text.toCharArray();
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
