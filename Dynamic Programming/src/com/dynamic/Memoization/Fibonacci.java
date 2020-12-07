package com.dynamic.Memoization;

public class Fibonacci {
    public static void main(String[] args){
        //Write a function that takes in a number as an argument.
        //The function should return the n-th number of the Fibonacci sequence.

        System.out.println("FibNorm: "+fibNorm(50));
        System.out.println("FibRec: "+fibRec(50));
    }
    public static int fibNorm(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        return a;
    }
    public static int fibRec(int n){
        if(n<=2){
            return 1;
        }
        return fibRec(n-1)+fibRec(n-2);
    }
}
