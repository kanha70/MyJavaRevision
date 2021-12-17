package Training.HomeWork;

import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number to find the table :");
        table(sc.nextInt());
    }

    private static void table(int num) {
        for (int i = 1; i<= 10; i++){
            System.out.println(num * i);
        }
    }
}
