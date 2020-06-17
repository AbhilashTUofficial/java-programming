package com.learn;

import java.util.Scanner;

class Account {

    long balance;
    String username="abc";
    String password="abc";

    public Account() {
        System.out.println("Welcome to Abhilash banks");
        entry();
    }

    public void entry() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n1.LogIn\n2.Sign up\n3.exit");
        int choice;
        do {
            System.out.print("Enter your choice: ");
           choice = input.nextInt();
            switch (choice) {
                case 1:
                    logIn();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice try again");
                    break;
            }
        } while (choice != 3);


    }

    public void createAccount() {
        System.out.print("Enter your username: ");
        Scanner input=new Scanner(System.in);
        username=input.next();
        System.out.print("Enter your password: ");
        password=input.next();
        System.out.print("Confirm password: ");
        String tempPassword=input.next();
        if (tempPassword.equals(password)){
            entry();
        }
        else{
            System.out.println("Password mismatch try again");
            createAccount();
        }

    }

    public void terminateAccount() {

    }

    public void logIn() {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        if (username.equals(input.next())) {
            System.out.print("Password: ");
            if (password.equals(input.next())) {
                account();

            }
        }


    }

    public void logOut() {

    }

    public void account() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Deposit \n2.Withdraw\n3.Balance info\n4.exit");
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    balanceInfo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice try again");
                    break;
            }
        } while (choice != 4);


    }

    public void deposit() {
        System.out.print("Enter your amount: ");
        Scanner input = new Scanner(System.in);
        balance += input.nextLong();
        account();
    }

    public void withdraw() {
        System.out.print("Enter the amount: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        if (amount > balance) {
            System.out.println("you account dont have that much balance ");
        } else if (amount < 0) {
            System.out.println("negative amount");

        } else {
            balance -= amount;
        }

        account();
    }
    public void balanceInfo(){
        System.out.println("your ac balance: "+balance);
        account();
    }
}

public class Main {

    public static void main(String[] args) {

        Account obj = new Account();

    }
}
