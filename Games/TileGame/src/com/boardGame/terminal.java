package com.boardGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class terminal {
    int hole;
    void print(int[] array){
        System.out.println(array[0]+" "+array[3]+" "+array[6]);
        System.out.println(array[1]+" "+array[4]+" "+array[7]);
        System.out.println(array[2]+" "+array[5]+" "+array[8]);

    }
    void randomize(int[] array) {
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    void findHole(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]==9){
                hole=i;
            }
        }
    }
    void makeChoice(String choice,int[] array){
        if(choice.equals("a")){
            findHole(array);
            if(hole<3&&hole>-1){
                System.out.println("Cant move");
            }
            else{
                int temp=array[hole];
                array[hole]=array[hole-3];
                array[hole-3]=temp;
            }
        }
        if(choice.equals("d")){
            findHole(array);
            if(hole<9&&hole>5){
                System.out.println("Cant move");
            }
            else{
                int temp=array[hole];
                array[hole]=array[hole+3];
                array[hole+3]=temp;
            }
        }
        if(choice.equals("w")){
            findHole(array);
            if(hole==0||hole==3||hole==6){
                System.out.println("Cant move");
            }
            else{
                int temp=array[hole];
                array[hole]=array[hole-1];
                array[hole-1]=temp;
            }
        }
        if(choice.equals("s")){
            findHole(array);
            if(hole==2||hole==5||hole==8){
                System.out.println("Cant move");
            }
            else{
                int temp=array[hole];
                array[hole]=array[hole+1];
                array[hole+1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        String choice="";
        terminal obj=new terminal();
        Scanner input=new Scanner(System.in);
        obj.print(array);
        System.out.println("\n");
        obj.randomize(array);
        obj.print(array);
        while (!choice.equals("e")) {
            System.out.println();
            choice=input.nextLine();
            obj.makeChoice(choice,array);
            obj.print(array);
        }
    }
    //main loop
}
