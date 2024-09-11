

import java.util.Scanner;

class Calculator{
    int Sum (int a, int b){
        return (a+b);
    }
    int Difference(int a, int b){
        if (a>b){
            return (a-b);
        }
        else{
            return (b-a);
        }
    }
    int Product(int a, int b){
        return a*b;
    }
    float Quotient(int a, int b){
        if (a>b){
            return a/b;
        }
        else{
            return b/a;
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Integers a & b space seperated: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1: Sum, 2: Difference, 3: Product, 4: Quotient");
        int c = sc.nextInt();

        int result;
        float Qr;

        Calculator Ca = new Calculator();

        switch (c){
            case 1:
                result = Ca.Sum(a,b);
                System.out.println(result);
                break;
            case 2:
                result = Ca.Difference(a,b);
                System.out.println(result);
                break;
            case 3:
                result = Ca.Product(a,b);
                System.out.println(result);
                break;
            case 4:
                Qr = Ca.Quotient(a,b);
                System.out.println(Qr);
                break;
        }

    }

}
