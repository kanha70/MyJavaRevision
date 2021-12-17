package com.company.ControlFlow.Array;

public class CloneArray {
    public static void main(String[] args) {
        int []original = {1,2,3,4,5};
        System.out.println("Before Cloning of array");
        for (int i: original){
            System.out.println(i);
        }
        int cloneArray[] = original.clone();
        System.out.println("After cloning the Array");
        for (int j: cloneArray) {
            System.out.println(j);
        }
        System.out.print("Are both are equal :=>");
        System.out.println(" "+(original == cloneArray));
    }
}
