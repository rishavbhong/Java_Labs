import java.util.Scanner;

public class PasswordMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        int lcase = 0;  // Indicates presence of lowercase
        int ucase = 0;  // Indicates presence of uppercase
        int lnumber = 0;  // Indicates length is within valid range

        for (int i = 0; i < len; i++) {
            int k = (int) s.charAt(i);  // Storing the password as an array of characters

            // Check for lowercase letters (ASCII range 97-122)
            if (k >= 97 && k <= 122) {
                lcase = 1;
            }
            // Check for uppercase letters (ASCII range 65-90)
            else if (k >= 65 && k <= 90) {
                ucase = 1;
            }
        }

        System.out.println("lcase: " + lcase);
        System.out.println("ucase: " + ucase);

        // Check if the length is within the valid range
        if (len >= 5 && len <= 12) {
            lnumber = 1;
        }
        System.out.println("length in range: " + lnumber);

        // Final validation
        if (ucase == 1 && lnumber == 1 && lcase == 1) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
