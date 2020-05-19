package com.codes;
class Main{
    public static void main(String[] args){
        int nurseHoward=8;
        int nursePease=10;
        int nurseCambell=9;
        int nurseGrace=8;
        int nurseMcCarthy=7;
        int nurseMurphy=12;
        float totalWorkingHours=nurseHoward+nursePease+nurseCambell+nurseGrace+nurseMcCarthy+nurseMurphy;
        int numberOfNurse=6;
        float averageWorkingHours=totalWorkingHours/numberOfNurse;
        System.out.println(averageWorkingHours);
    }
}