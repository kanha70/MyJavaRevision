package ExceptionHandling;

import java.util.Scanner;

// throw is used to create UserDefined Exception
public class UseOfThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            try {
                System.out.println("Please Enter Marks :");
                int marks = sc.nextInt();
                if (marks == 100){
                    throw new chetuException("Exception Case ");
                }else if (marks >= 40){
                    System.out.println("Pass");
                }else {
                    System.out.println("Fail");
                }
            }catch (chetuException e){
                System.out.println("Well Done");
            }

        }
    }
}
class chetuException extends Exception{
    public chetuException(String str){
        System.out.println(str);
    }
}