package New;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Please enter the array of size 5");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        smallestIndex(arr,min);

    }

    private static void smallestIndex(int[] arr, int min) {

        int index = 0;
        while (arr[index]>=0){



          
    }
        System.out.println("Smallest Index is "+index);
    }
}
