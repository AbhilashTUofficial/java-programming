package com.codes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Challenge no5");
        System.out.println("Question:\n\tDuring the last week of track training.\n\tShoshanna achieves the following times in");
        System.out.println("\tseconds \n\trounds:66,57,54,53,64,52 and 59.\n\tFind her best score using bubble sort.");
        int[] scoreArray = {66, 57, 54, 53, 64, 52, 59};
        int[] tempArray = new int[scoreArray.length];
        int i ;
        int j ;
        for (i=0; i < scoreArray.length; i++) {
            for (j = 0; j < scoreArray.length; j++) {
                if (scoreArray[i] > scoreArray[j]) {
                    tempArray[i] = scoreArray[i];
                    scoreArray[i] = scoreArray[j];
                    scoreArray[j] = tempArray[i];
                }
            }

        }

        System.out.println(Arrays.toString(scoreArray));
    }
}