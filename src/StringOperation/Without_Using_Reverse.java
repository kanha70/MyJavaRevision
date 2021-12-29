package StringOperation;


import java.util.Scanner;

public class Without_Using_Reverse {
    public static void main(String[] args) {
      //  String str = "Kanhaiya Lal Prajapati";

        //Using Char Array
/*        for (int i = charArray.length-1; i >= 0; i--){
            System.out.print(charArray[i]);
   }*/

        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter String :");
        str = sc.nextLine();
        String []token = str.split("");

        for (int i = token.length-1; i >= 0; i--){
            System.out.print(token[i]);
        }
    }
}
