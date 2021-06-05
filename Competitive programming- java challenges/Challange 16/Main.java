package com.challenges;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.print("Enter the Number: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int dividedBy10;
        int modulesBy10;
        do{
            modulesBy10=number%10;
            dividedBy10=number/10;
            number=modulesBy10+dividedBy10;

        }while(number>9);
        System.out.println("Sum of individual digits: "+number);


    }
}