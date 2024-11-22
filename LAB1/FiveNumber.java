import java.util.Scanner;

public class FiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Five digit number: ");
        int num = sc.nextInt();

        int [] number = new int[5];
        for (int i =0;i <5;i++){
            number[i] = num%10;
            num = num/10;
        }
        for (int i = 4;i >= 0;i--){
            System.out.print(number[i] + "  ");
        }
    }
}
