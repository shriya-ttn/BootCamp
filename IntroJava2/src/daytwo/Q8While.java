package daytwo;
import java.util.Scanner;

public class Q8While {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter some words to check : ");
        String entry=sc.next();
        while(!entry.equals("done|DONE|Done")){
            char ch1=Character.toLowerCase(entry.charAt(0));
            char ch2=Character.toLowerCase(entry.charAt(entry.length()-1));
            if(ch1==ch2){
                System.out.println("SAME first and last char in : "+entry);
            }
            else{
                System.out.println("DIFFERENT first and last char in : "+entry);

            }
            entry=sc.next();
        }
    }
}
