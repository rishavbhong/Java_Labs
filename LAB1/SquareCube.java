public class SquareCube {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
        System.out.println("----------------------------");
        for(int i =0; i<=10;i++){
            System.out.printf("%-10s %-10s %-10s\n", i, i*i, i*i*i);
        }
    }

}


//Explanation
//        % is the format specifier.
//        -10s aligns the string to the left with a width of 10.
//        10.2f formats a floating-point number with two decimal places and a width of 10.