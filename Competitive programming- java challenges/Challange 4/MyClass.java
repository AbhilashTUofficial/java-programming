package com.challenge4;

public class MyClass {
    final String itemName = "hot dogs";
    long numberOfTotalItem = 400;
    int packageLimit = 8;
    int totalPackage = 0;

    void findHowManyPackage() {
        System.out.println("it will work");
        while (numberOfTotalItem > packageLimit) {
            if (numberOfTotalItem >= packageLimit) {

                numberOfTotalItem -= packageLimit;
                totalPackage++;

            }

        }
        System.out.println("All " + itemName + " are packed up ,balance: " + numberOfTotalItem);
        System.out.println("total package: " + totalPackage);

    }
}