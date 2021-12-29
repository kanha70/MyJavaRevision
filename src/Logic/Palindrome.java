package Logic;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase(Locale.ROOT);

        int a_pointer = 0;
        int b_pointer = A.length() - 1;

        while (a_pointer <= b_pointer) {
            if (A.charAt(a_pointer) != A.charAt(b_pointer)) {
                System.out.println("No! , It's not Palindrome");
                return;
            }
            a_pointer++;
            b_pointer--;
        }

        System.out.println("Yes It's is A Palindrome");
    }
}
