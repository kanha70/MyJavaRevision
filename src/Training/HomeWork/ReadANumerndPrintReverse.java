package Training.HomeWork;

import java.util.Scanner;

public class ReadANumerndPrintReverse {
    public static void main(String[] args) {
        System.out.println("Please enter the Number :");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNumber = num;

        System.out.println("You Entered "+num+"\n");

        int noOfdigits = 0;
        int reverse = 0;

        while (num != 0){
            int lastDigit = num % 10;
            reverse = ( reverse * 10 ) + lastDigit;
            noOfdigits++;
            num = num/10;
       }

        System.out.println("Reverse of that Number is :"+reverse+"\n");
        System.out.println("Number of Digit is :"+noOfdigits+"\n");
        if (originalNumber == reverse) System.out.println("This is A Palindrome Number"+"\n");
        else System.out.println("This is not a Palindrome Number"+"\n");
        System.out.println("Is this Number Prime: "+isPrime(originalNumber));
    }

    private static boolean isPrime(int num) {
       if ( num <= 1){
           return false;
       }
       for (int i = 2; i < Math.sqrt(num); i++){
           if ( num % i == 0){
               return false;
           }
       }
      return true;
    }
}
