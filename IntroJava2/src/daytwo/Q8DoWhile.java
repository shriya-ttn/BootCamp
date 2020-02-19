package daytwo;

import java.util.Scanner;

public class Q8DoWhile {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter some words to check : ");
        String word=sc.next();

        do{
            char ch1= Character.toLowerCase(word.charAt(0));
            char ch2=Character.toLowerCase(word.charAt(word.length()-1));
            if(ch1==ch2){
                System.out.println("SAME first and last char in : " +word);
            }
            else {
                System.out.println("DIFFERENT first and last char in : " + word);
            }
            word=sc.next();
        }

        while(!word.matches("done|DONE|Done"));

    }
}
