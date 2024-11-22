import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Circumference: "+ 2*Math.PI*radius);
        System.out.println("Area: "+ Math.PI*radius*radius);
        System.out.println("Diamete: "+ 2*radius);
    }
}
