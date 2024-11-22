import java.util.Scanner;

class Calc{
    int sum (int a, int b, int c)
    {
        return a+b+c;
    }
    int product (int a, int b, int c){
        return a*b*c;
    }
    int average (int a, int b, int c){
       int result = sum(a,b,c);
       return result/3;
    }
    int largest (int a, int b, int c){
       if (a>b && a>c){
           return a;
       }
       else if(b>a && b >c){
           return b;
       }
       else {
           return c;
       }
    }
    int smallest (int a, int b, int c){
        if (a<b && a<c){
            return a;
        }
        else if(b<a && b <c){
            return b;
        }
        else {
            return c;
        }
    }

}
public class AdvCalculator {
    public static void main(String[] args) {
        Calc ca = new Calc();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three numbers Space separated: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Sum: "+ca.sum(a,b,c));
        System.out.println("Product: "+ ca.product(a,b,c));
        System.out.println("Average :" + ca.average(a,b,c));
        System.out.println("Largest: "+ ca.largest(a,b,c));
        System.out.println("Smallest: "+ ca.smallest(a,b,c));



    }
}
