package daytwo;

public class Q11WhileInsteadofFor {

    /*
  Given FOR LOOP in question
    public static void main(String[] args) {
    int s = 0;
    int t = 1;
    for (int i = 0; i < 10; i++)
    {
        s = s + i;
        System.out.println("s"+s);
        for (int j = i; j > 0; j--)
        {
            t = t * (j - i);
            System.out.println("t"+t);
        }
        s = s * t;
        System.out.println("T is " + t);
    }
    System.out.println("S is " + s);
}

*/

    // Converted to WHILE LOOP
    public static void main(String[] args) {
        int s=0, t=1, i=0, j=0;
        while(i<10){
            s+=i;

            j=i;
            while(j>0){
                t*=(j-i);

                j--;
            }
            s*=t;
            System.out.println("T is "+t);
            i++;
        }
        System.out.println("S is "+s);
    }
}
