package com.company.ControlFlow.PatternPractice.SimpleLogic;

public class Pattern {

    public static void main(String[] klp) {
       int n = 5;

       //For Upper Half Design
       for (int i = 1; i <= n; i++) {

           //Decreasing Space     ===>   in
           for (int j = i; j <= n; j++) {
               System.out.print("    ");  // use Four Space for symmetric View
           }


           //Increasing star         ===>   1i in case of removing last double line run loop till < instead of <= ;
           for (int j = 1; j < i; j++) {
               System.out.print("*  ");
           }

           //Increasing Star         ===>   1i
           for (int k = 1; k <= i; k++) {
               System.out.print("*  ");
           }

           System.out.println();
       }

       //For Lower half Design
       for (int i = 2; i<=n; i++){

           // Increasing Space ==>  1i
           for (int j =1 ; j<= i; j++){
               System.out.print("    ");
           }
           // Decreasing Star      ==> in
           for (int j = i; j <=n; j++ ){
               System.out.print("*  ");
           }
           //  Decreasing Stars    ==> in
           for (int j = i; j < n; j++){
               System.out.print("*  ");
           }


           System.out.println();
       }

    }
}
