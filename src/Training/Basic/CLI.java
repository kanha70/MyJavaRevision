package Training.Basic;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);

 /*       //Reverse
        System.out.println("Please Enter two Digits Numbers :");
        int x = sc.nextInt();
        int initial = x;
        int temp1 = x % 10;
        x/=10;
        int temp2 = x % 10;
        System.out.println("Reverse order of the Digit :"+initial+" is : "+temp1+temp2);
  */

    //Swap the Number
/*        int x = 20;
        int y = 10;
        System.out.println();
        System.out.println("Initial value of X is : "+x +" and Initial Value of Y is : "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Now after swapping x : "+x +" and Now after swapping  y :"+y);
*/

        // Int to Octal
        System.out.println();
        int x = 65;
        System.out.println("Integer Value is "+x);
        System.out.println("Octal Value of "+x+ " is "+Integer.toOctalString(x));
        System.out.println("Hex Value of "+x+ " is "+Integer.toHexString(x));


    }
}
