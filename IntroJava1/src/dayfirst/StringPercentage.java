package dayfirst;

public class StringPercentage {
    public static void main(String[] args) {
        String str = "shriyaGarg.123@gmail.com";
        int count = 0, upperCase=0, lowerCase=0, digits=0, specialChar=0;
        float ucase_p, lcase_p, dig_p, spchar_p;

        count = str.length();
        for (int i=0; i<count; i++){

            if (Character.isUpperCase(str.charAt(i)))
                upperCase++;

            else if (Character.isLowerCase(str.charAt(i)))
                lowerCase++;

            else if (Character.isDigit(str.charAt(i)))
                digits++;
            else
                specialChar++;
        }

        ucase_p = (float)upperCase/(float)count *100;
        lcase_p = (float)lowerCase/(float)count *100;
        dig_p = (float) digits/ (float)count *100;
        spchar_p= (float)specialChar/ (float)count *100;


        System.out.println("Total characters in String '"+str+"' = " + count);
        System.out.println("No. of Uppercase letters: " + upperCase + " and % = " +
                ucase_p);
        System.out.println("No. of lowercase letters: " + lowerCase + " and % = " +
                lcase_p);
        System.out.println("No. of digits: " + digits + " and % = " + dig_p);
        System.out.println("No. of special letters: " + specialChar + " and % = " +
                spchar_p);

    }
}
