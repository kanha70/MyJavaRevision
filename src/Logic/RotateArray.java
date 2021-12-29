package Logic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int k = 1;
        int[]result = rotArray(a,k);
//        System.out.println(Arrays.toString(result));
        for (int element : result){
            System.out.print(element);
        }
    }

    private static int[] rotArray(int[] a,int k) {
        int size = a.length;
        int [] rot_arr = new int[size];
        int rot_index = k;
        int i = 0;
        while (rot_index < size){
            rot_arr[i] = a[rot_index];
            i++;
            rot_index++;
        }
        rot_index = 0;
        while (rot_index < k ){
            rot_arr[i] = a[rot_index];
            i++;
            rot_index++;
        }
        return rot_arr;
    }
}
