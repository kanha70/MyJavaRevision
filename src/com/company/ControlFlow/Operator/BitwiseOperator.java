package com.company.ControlFlow.Operator;

public class BitwiseOperator {
    public static void main(String[] args) {

        int a = 5; //101
        int b = 13;

        int c = a&b; //  Basically Binary to decimal equivalent  2^n+2^n-1+.....

        int d = a | b;

        int e = b >> 1; // Basically Every time 2 se Divide hoga; Yaha 1 hai to ek baar divide hoga;

        System.out.println("And Operation"+c);
        System.out.println("OR Operation"+d);
        System.out.println("Bitwise shift Operator"+e);
    }
}
