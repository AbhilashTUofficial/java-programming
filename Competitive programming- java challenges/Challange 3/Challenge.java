package com.sample;

import java.util.Scanner;

public class Challenge {
    int cup300ml = 0;
    int cup500ml = 0;
    boolean hasCup300ml = false;
    boolean hasCup500ml = false;
    Scanner input = new Scanner(System.in);

    void prompt() {
        System.out.println("A chef was cooking something special which required exact");
        System.out.println("200ml water but he doesn't have 200ml cup he has a  500ml");
        System.out.println("cup and a 300ml cup but that dish required exactly 200ml");
        System.out.println("water\nCan you solve this problem in Java?");

    }

    void promptChoose() {
        System.out.println("\n1.Let me try\n2.No i cant");
        switch (makeChoice()) {
            case 1: {
                System.out.println("Good luck");
                chooseCup();
                break;
            }
            case 2: {
                quit();
                break;
            }
            default: {
                wrongChoose();
                promptChoose();
                break;
            }
        }

    }

    void chooseCup() {
        System.out.println("\n1.Take 300ml cup\n2.Take 500ml cup\n3.Take both cups\n4.Next\n5.Quit");
        switch (makeChoice()) {
            case 1: {
                System.out.println("You have 300ml cup in your hand");
                hasCup300ml = true;
                chooseCup();
                break;
            }
            case 2: {
                System.out.println("You have 500ml cup in you hand");
                hasCup500ml = true;
                chooseCup();
                break;
            }
            case 3: {
                System.out.println("You have both 300ml and 500ml cup in you hand");
                hasCup300ml = true;
                hasCup500ml = true;
                chooseCup();
                break;
            }
            case 4: {
                System.out.println("This is the fun part");
                fillCup();
                break;
            }
            case 5: {
                quit();
                break;
            }
            default: {
                wrongChoose();
                chooseCup();
                break;
            }

        }
    }

    void fillCup() {
        System.out.println("\n1.Fill 300ml cup with water\n2.Fill 500ml cup with water\n3.Fill both cups");
        System.out.println("4.Transfer water from 300ml cup to 500ml cup \n5.Transfer water from 500ml cup to 300ml cup \n6.next\n7.Quit");
        switch (makeChoice()) {
            case 1: {
                if (hasCup300ml) {
                    System.out.println("Now 300ml cup have full water");
                    cup300ml = 300;
                } else {
                    System.out.println("You don't have 300ml cup");
                }

                fillCup();
                break;
            }
            case 2: {
                if (hasCup500ml) {
                    System.out.println("Now 500ml cup have full water");
                    cup500ml = 500;
                } else {
                    System.out.println("You don't have 500ml cup");
                }
                fillCup();
                break;
            }
            case 3: {
                if (hasCup300ml && hasCup500ml) {
                    System.out.println("Now 300ml cup and 500ml cup have full water");
                    cup300ml = 300;
                    cup500ml = 500;
                } else {
                    System.out.println("You don't have no cup");
                }
                fillCup();
                break;
            }
            case 4: {
                if (hasCup300ml) {
                    if (cup300ml != 0 && cup500ml != 500) {
                        cup500ml = cup500ml + cup300ml;
                        if (cup500ml > 500) {
                            int exWater = cup500ml - 500;
                            cup300ml += exWater;
                            cup500ml = 500;
                        }
                        System.out.println("Okay now 300ml has " + cup300ml + "ml water and 500ml cup has " + cup500ml + "ml water");
                    } else if (cup500ml == 500) {
                        System.out.println("The 500ml cup is full");
                    } else {
                        System.out.println("The 300ml cup has no water");
                    }

                } else {
                    System.out.println("You don't have 300ml cup");
                }

                fillCup();
                break;
            }
            case 5: {
                if (hasCup500ml) {
                    if (cup500ml != 0 && cup300ml != 300) {
                        cup300ml += cup500ml;
                        if (cup300ml > 300) {
                            int exWater = cup300ml - 300;
                            cup500ml = exWater;
                        }
                        System.out.println("Okay now 500ml has " + cup500ml + "ml water and 500ml cup has " + cup300ml + "ml water");
                    } else if (cup300ml == 300) {
                        System.out.println("The 300ml cup is full");
                    } else {
                        System.out.println("The 500ml cup has no water");
                    }

                } else {
                    System.out.println("You don't have 500ml cup");
                }

                System.out.println("Okay now 500ml has " + cup500ml + "ml water and 300ml cup has " + cup300ml + "ml water");
                fillCup();
                break;
            }
            case 6: {
                measureWater();
                break;
            }
            case 7: {
                quit();
                break;
            }
            default: {
                wrongChoose();
                fillCup();
                break;
            }

        }

    }

    void measureWater() {
        System.out.println("1.measure water in 300ml\n2.Measure water in 500ml\n3.Quit");
        switch (makeChoice()) {
            case 1: {
                if (hasCup300ml) {
                    System.out.println("The cup has " + cup300ml + "ml of water");
                    if (cup300ml == 200) {
                        win();
                    } else {
                        measureWater();
                    }
                } else {
                    System.out.println("You don't have the cup");
                }
                break;
            }
            case 2: {
                if (hasCup500ml) {
                    System.out.println("The cup has " + cup500ml + "ml of water");
                    if (cup500ml == 200) {
                        win();
                    } else {
                        measureWater();
                    }
                } else {
                    System.out.println("You don't have the cup");
                }
                break;
            }
            case 3: {
                quit();
                break;
            }
            default: {
                wrongChoose();
                measureWater();
                break;
            }

        }

    }

    void quit() {
        System.out.println("Oh okay");
    }

    int makeChoice() {
        System.out.print("Enter your choice:");
        int choose = input.nextInt();
        return choose;
    }

    void wrongChoose() {
        System.out.println("Wrong choice try again");
    }

    void win() {
        System.out.println("YOU WIN!!!");
    }
}
