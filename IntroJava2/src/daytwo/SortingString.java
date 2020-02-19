package daytwo;

public class SortingString {
    public static void main(String[] args) {
        String str = "ddecaf";
        System.out.println("Original String: "+str);
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length-1; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            System.out.print("Sorted String: "+ch[i]);
        }
    }
}