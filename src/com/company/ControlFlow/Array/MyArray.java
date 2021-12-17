package com.company.ControlFlow.Array;

public class MyArray {
    static void min(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int a[] = {33, 45, 67, 11,0,34};
        min(a);
    }
}
