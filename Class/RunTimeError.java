import java.io.IOException;

import java.util.Scanner;

public class RunTimeError
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        try{
            n = 1/(n-3);
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
            ex.printStackTrace();
        }

    }
}
