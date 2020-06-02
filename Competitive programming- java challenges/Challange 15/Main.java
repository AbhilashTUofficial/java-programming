package com.challenges;
class Main{
    public static void main(String[] args){
        float totalEarnings;
        float dvdPer=12;
        float spent=42;
        totalEarnings=(spent/(dvdPer/100));
        System.out.println("Total Earnings: "+totalEarnings);
        System.out.println("deposited : "+(totalEarnings-spent));
    }
}