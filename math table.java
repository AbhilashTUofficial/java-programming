package com.challenges;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        boolean quit=false;
        System.out.println("The math table");
        while(!quit){
            Scanner input =new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number=input.nextInt();
            System.out.print("Enter the limit: ");
            int iteration=input.nextInt();
            System.out.print("Enter the operation: ");
            String operation=input.next();
            switch (operation) {
                case "+":
                    for (i = 1; i <=iteration; i++) {
                        System.out.println(i + "+" + number + "=" + (i + number));
                    }
                    break;
                case "-":
                    for (i = 1; i <=iteration; i++) {
                        System.out.println(i + "-" + number + "=" + (i - number));
                    }
                    break;
                case "x":
                    for (i = 1; i <=iteration; i++) {
                        System.out.println(i + "x" + number + "=" + (i * number));
                    }
                    break;
                case "/":
                    for (i = 1; i <=iteration; i++) {
                        System.out.println(i + "/" + number + "=" + (i / number));
                    }

                    break;
                case "%":
                    for (i = 1; i <=iteration; i++) {
                        System.out.println(i + "%" + number + "=" + (i % number));
                    }
                    break;
                case "quit":
                    quit=true;
                default:
                    System.out.println("invalid operator!");
                    break;
            }
        }
    }
}