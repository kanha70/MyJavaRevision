package New;

import java.util.Scanner;

public class nBits {
    public static void main(String[] args) {
        System.out.println("Please enter the Integer Number to find the required Bits :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        requiredBit(number);

    }

    private static void requiredBit(int number) {
        int count = 0;
        int originalNumber = number;
        while ( number > 0){
            count += number & 1;
            number >>= 1;
        }
        System.out.println("Number :"+originalNumber+" Requires " +count+" bits of Memory");
    }
}
