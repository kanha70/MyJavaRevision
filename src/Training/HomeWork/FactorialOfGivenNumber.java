package Training.HomeWork;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        int result, num = scanner.nextInt();
        result = factorial(num);
        System.out.println("Factorial of Number "+num+" is " +result);

    }


    /*
   static int factorial(int num) {
     if (num == 0) return 1;
     else return (num * factorial(num-1));
*/


 // Using For Loop
    static int factorial(int n){
       int res = 1;
        for (int i = n; i>=1 ; i--){
                res *=  i;
      }
   return res;
    }
}
