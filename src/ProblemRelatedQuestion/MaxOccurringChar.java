package ProblemRelatedQuestion;

import java.util.Scanner;

public class MaxOccurringChar {
     public static char maxOccuring(String str){
                     int []arr = new int[128];
                     for (int i = 0; i < str.length(); i++){
                        char c = str.charAt(i);
                        arr[c]++;
                     }

                     int max = 0;
                     char c = str.charAt(0);
                     for (int i = 0; i < 128; i++){
                         if (arr[i] > max){
                             max = arr[i];
                             c = (char) i;
                         }
                     }
                     int count = 0;
                     for (int i = 0; i < 128; i++){
                         if (arr[i] == max) count++;
                         if (count > 1) return 0;
                     }
                     return c;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String :");
        String str = sc.nextLine();
        System.out.println(maxOccuring(str));
    }
}
