package com.learn;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] array={12,13,8,10,17};
        int len=array.length-1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(new int[]{array[len]}));

    }
}
