package com.challenges;
class Main{
    public static void main(String[] args){
        long redBloodCells=5_000_000;
        long whiteBloodCells=8_000;
        int i=1;


        do{
            redBloodCells=redBloodCells-1;
            whiteBloodCells=whiteBloodCells-1;

        }while(whiteBloodCells>1);
        System.out.println("Ratio red:white= "+redBloodCells+":"+whiteBloodCells);
    }
}