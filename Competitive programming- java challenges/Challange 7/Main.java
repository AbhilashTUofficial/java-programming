package com.codes;
class Calc{
    int days=0;
    long peoplePerDay=1_200_00;
    long totalPeopleCarried=0;
    int oneYear=365;
    void find(){
        if(days<oneYear){
            totalPeopleCarried+=peoplePerDay;
            days++;
            find();
        }
        else{
            System.out.println("Total people carried in an year: "+totalPeopleCarried);
        }
    }
}
class Main{
    public static void main(String[] args){
        Calc obj=new Calc();
        obj.find();
    }
}