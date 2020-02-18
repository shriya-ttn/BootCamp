package dayfirst;

public class CountDuplicate {
    public static void main(String[] args) {
        String input = "Hi hello black blue hElLO blue Blue ";
        input = input.toLowerCase();
        String[] words = input.split(" ");
        int wcount=1;

        for (int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if (words[i].equals(words[j])){
                    wcount+=1;
                    words[j]="0";
                }
            }
            if (words[i]!="0" && wcount>1) System.out.println(words[i]+ " : "+ wcount);
            wcount=1;
        }
    }
}
