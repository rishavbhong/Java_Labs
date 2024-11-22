import java.util.Scanner;

public class Repetittion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range: ");
        int a = sc.nextInt();
        System.out.println("Enter ending range: ");
        int b = sc.nextInt();
        System.out.println("Enter Key: ");
        int key = sc.nextInt();

        String str_key = Integer.toString(key);
        int key_length = str_key.length();
   
       for(int i=a;i<=b;i++){
        String str = Integer.toString(i);
        for(int i=0; i<str.length();i+key_length){
            
        }

       }

    }
    
}
