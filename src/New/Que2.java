package New;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        String msg = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your message : ");
        msg = sc.nextLine();
        if (msg.length() >= 6 && msg.length() <= 6){
            System.out.println(msg);
        }
    }
}
