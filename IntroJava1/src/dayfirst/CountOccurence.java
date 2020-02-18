package dayfirst;

public class CountOccurence {
    public static void main(String[] args) {
        String str = "Java is an OOP language";
        String recStr = "a";  //Recurring string
        int count = str.length() - str.replace(recStr, "").length();
        System.out.println("Number of occurrence of 'a' in String \n'"+str+"' = "+ count);
    }
}
