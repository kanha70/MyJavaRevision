package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=5; i++ ){
            try {
                System.out.println("Enter First Value :");
                int first = sc.nextInt();
                System.out.println("Enter Second Value :");
                int second = sc.nextInt();
                int result = first/second;
                System.out.println("Result is := "+result);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }catch (InputMismatchException e){
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }

            finally {
                System.out.println("Program is Continue ");
            }

        }
    }
}
