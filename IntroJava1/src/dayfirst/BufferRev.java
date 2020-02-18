package dayfirst;

public class BufferRev {

    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer("This is Shriya");
        System.out.println("Original String : "+ strBuff);
        strBuff.reverse();
        System.out.println("Reverse String : "+strBuff);

        strBuff.replace(4,9,"");
        System.out.println("Editted String : "+strBuff);
    }
}
