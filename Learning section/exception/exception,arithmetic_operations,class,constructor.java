package com.codes;
import java.util.Scanner;
class Operations{
    Operations(int numberOne,int numberTwo){
        System.out.println("Addition");
        System.out.println(numberOne+"+"+numberTwo+"="+(numberOne+numberTwo));
        System.out.println("Subtraction");
        System.out.println(numberOne+"-"+numberTwo+"="+(numberOne-numberTwo));
        System.out.println("Multiplication");
        System.out.println(numberOne+"*"+numberTwo+"="+(numberOne*numberTwo));
        System.out.println("Division");
        try{
            System.out.println(numberOne+"/"+numberTwo+"="+(numberOne/numberTwo));
        }catch(Exception e){
            System.out.println("you can't divide any number by zero");
        }


    }

}
class Main{
    public static void main(String[] args){
        System.out.println("Arithmetic operations");
        int numberOne;
        int numberTwo;
        System.out.print("Enter the first number: ");
        Scanner input=new Scanner(System.in);
        numberOne=input.nextInt();
        System.out.print("Enter the second number: ");
        numberTwo=input.nextInt();
        Operations obj=new Operations(numberOne,numberTwo);

    }
}