//package com.gsv.stringdemo;

public class DemoExceptionReturn {
    public static void main(String[] args) {
        int j = test(9);
        System.out.println("Value of j: "+j);

    }
    public static int test(int i) {
        int j = 0;
        try {
            j = i / (i - 9);
            return j;
        } catch (ArithmeticException ex) {
            System.out.println("Divide by zero");
            return 5;
        }
        finally {
            return 4; //Finally will overwrite the return from "try" & "catch"
        }
        return 6;
    }
}

