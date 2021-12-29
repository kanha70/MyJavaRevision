package Logic;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String result = getSmallestandLongest(s,k);
        System.out.println(result);
    }

    private static String getSmallestandLongest(String s, int k) {
        String current_subString = s.substring(0,k);
        String smallest = current_subString;
        String longest = current_subString;

        for (int i = 1; i <= s.length()-k; i++){
            current_subString = s.substring(i,i+k);
            if (current_subString.compareTo(longest) > 0){
                longest = current_subString;
            }
            if (current_subString.compareTo(smallest)< 0){
                smallest = current_subString;
            }
        }
        return smallest+"\n"+longest;
    }
}
