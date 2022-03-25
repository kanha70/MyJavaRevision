package com.company.ControlFlow.StringOperation;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // For printing 1 to 10
//        for (int i = 1;i<=10;i++){
//            System.out.println(i);
//      }

   // sum of 10 Natural Numbers
//        int sum = 0;
//        for (int i = 1;i<=10;i++){
//
//             sum +=i;
//        }
//        System.out.println(sum);

        // Table of entered positive number
        // Using For loops

//        int i=1;
//        System.out.println("Please Enter a positive Number for obtain Table of it ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        do {
//            System.out.println(num * i);
//            i++;
//        }while (i<11);

    //Using For Loops
//    for (int i=1; i<=10; i++){
//            System.out.println(num*i);
//        }
//
    //Using While Loops
//        int i = 1;
//        while (i<11){
//            System.out.println(num*i);
//            i++;
//        }

    // Factorial Program of given Number
//         int factorial=1;
//        while (num >0){
//         factorial *= num;
//            num--;
//        }
//        System.out.println(factorial);

        // Power
//        System.out.println("Please Enter two positive Number for obtain Power of it ");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int result = 1;
//        while (num2>0){
//            result *= num1;
//            num2--;
//        }
//        System.out.println(result);

        //Reverse the Number
//     Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter the Number");
//        int number = sc.nextInt();
//        int temp = number;
//        int reverse = 0;
//        int remainder = 0;
//
//        while (temp>0){
//               remainder = temp % 10;
//               reverse = reverse * 10 + remainder;
//               temp/=10;
//        }
//        System.out.println("Reverse of "+number+" is "+reverse);

    // Read for even or odd number and print sum

        int evenSum = 0;
        int oddSum = 0;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int number = sc.nextInt();

        do {
            if (number % 2 ==0){
                 evenSum += number;
            }else {
                oddSum += number;
            }
           number--;

        }while (number>0);
        System.out.println("Even Sum is "+evenSum);
        System.out.println("Odd Sum is "+oddSum);

    }
}
