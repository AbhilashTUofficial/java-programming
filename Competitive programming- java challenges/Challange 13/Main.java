package com.challenges;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int kara_stand_price=5;
        int rani_stand_price=7;
        int karaSold;
        int raniSold;
        int karaEarned;
        int raniEarned;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter how much kara sold: " );
        karaSold=input.nextInt();
        System.out.print("Enter how much Rani sold: " );
        raniSold=input.nextInt();
        karaEarned=kara_stand_price*karaSold;
        raniEarned=rani_stand_price*raniSold;
        System.out.println("Kara earned"+karaEarned);
        System.out.println("Rani earned"+raniEarned);
        if(karaEarned>raniEarned){
            System.out.println("Kara earned "+karaEarned-raniEarned+"cents extra");
        }
        else
            System.out.println("Rani earned "raniEarned-karaEarned+"cents extra");

    }
}