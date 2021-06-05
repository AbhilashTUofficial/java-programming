package com.codes;

import java.util.Scanner;

class Floppy {
    static void disk(byte usedBytes, byte freeBytes) {
        for (int j = 0; j < usedBytes; j++) {
            System.out.print("1");
        }
        for (int j = 0; j < freeBytes; j++) {
            System.out.print("0");
        }
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("The floppy disk");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter how much space is used: ");
        byte usedBytes = input.nextByte();
        System.out.print("Enter how much free space: ");
        byte freeBytes = input.nextByte();
        int totalSpace = freeBytes + usedBytes;
        Floppy.disk(usedBytes, freeBytes);
        byte deleteBytes;
        byte useBytes;
        do{
            System.out.print("\nEnter how much you want to delete: ");
            deleteBytes = input.nextByte();
            if(deleteBytes>totalSpace){
                System.out.println("You don't have that much space!");
            }
            else{
                freeBytes += deleteBytes;
                usedBytes -= deleteBytes;
            }
        }while(deleteBytes>totalSpace);
        Floppy.disk(usedBytes, freeBytes);
        do{
            System.out.print("\nEnter how much you want use: ");
            useBytes = input.nextByte();
            if(useBytes>=freeBytes){
                System.out.println("You don't have that free space!");
            }
            else{
                freeBytes += deleteBytes;
                usedBytes -= deleteBytes;
            }
        }while(useBytes>=freeBytes);
        freeBytes-=useBytes;
        usedBytes+=useBytes;
        Floppy.disk(usedBytes, freeBytes);
    }
}