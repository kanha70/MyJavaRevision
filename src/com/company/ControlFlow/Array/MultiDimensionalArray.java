package com.company.ControlFlow.Array;

public class MultiDimensionalArray {

    public static void main(String[] args) {
     int ta[][] = {{3,4,5},{45,6,8},{54,32,2}};

     for (int i = 0; i < 3; i++){
         for (int j = 0; j < 3; j++){
             System.out.print(ta[i][j]+" ");
         }
         System.out.println();
     }
    }

}
