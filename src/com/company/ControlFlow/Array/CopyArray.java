package com.company.ControlFlow.Array;

public class CopyArray {
    public static void main(String[] args) {
        // Declaring Array
       char []src = {'m','y','f','i','r','s','t','a','r','r','a','y'};

       //Declaring destination Array
        char []dest = new char[10];
        System.arraycopy(src,2,dest,0,10);
        System.out.println(dest);
        System.out.println(String.valueOf(dest));
    }
}
