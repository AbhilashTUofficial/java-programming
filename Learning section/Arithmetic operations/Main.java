package com.learn;

import java.util.Scanner;

class ArithmeticOperations {
    float A;
    float B;
    float ans;
    int choice;

    ArithmeticOperations() {
        try {
            System.out.println("Arithmetic operations");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of A: ");
            A = input.nextInt();
            System.out.print("Enter the value of A: ");
            B = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input" + e);
            System.out.println("TRY AGAIN");
            new ArithmeticOperations();
        }


    }

    public float add() {
        ans = A + B;
        return ans;
    }

    public float sub() {
        ans = A - B;
        return ans;
    }

    public float mul() {
        ans = A * B;
        return ans;
    }

    public float div() {
        try {
            ans = A / B;

        } catch (Exception e) {
            System.out.println("ERROR DIVIDED BY ZERO \n" + e);
            return 0;
        }
        return ans;
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. exit");
        do {
            System.out.print("Make your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(add());
                    break;
                case 2:
                    System.out.println(sub());
                    break;
                case 3:
                    System.out.println(mul());
                    break;
                case 4:
                    System.out.println(div());
                    break;
                case 5:
                    break;

            }
        } while (choice < 5);


    }
}

public class Main {
    public static void main(String[] args) {
        ArithmeticOperations obj = new ArithmeticOperations();
        obj.display();

    }
}