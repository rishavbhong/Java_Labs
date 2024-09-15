import java.util.Scanner;

class Compare{
    int comp(int a, int b){
        if (a>b){
            return a;
        } else if (b>a) {
            return b;
        }
        else{
            return 0;
        }
    }
}
public class Larger {
    public static void main(String[] args) {
        Compare Co = new Compare();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the space seperated integers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int result = Co.comp(p,q);

        if (result == 0){
            System.out.println("Both the Numbers are equal");
        }
        else{
            System.out.println(result+" is greater ");
        }
    }


}
