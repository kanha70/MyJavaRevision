package com.company.ControlFlow.Array;

public class ReturningArray {
    static int[] get(){
        return new int[]{1,2,3,4,5,6};
    }

    public static void main(String[] args) {
        int a[] = get();
        for (int i = 0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }
    }
}
