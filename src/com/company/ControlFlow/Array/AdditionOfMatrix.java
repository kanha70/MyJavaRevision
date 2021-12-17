package com.company.ControlFlow.Array;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        int [][]first = {{1,2,3},{4,5,6}};
        int [][]second = {{1,2,3},{4,5,6}};

        int c[][] = new int[2][3];

        for (int i = 0; i<first.length; i++){
         for (int j = 0; j < first[i].length; j++){
             c[i][j] = first[i][j] + second[i][j];
             System.out.print(c[i][j]+" ");
         }
            System.out.println();
        }
    }
}
