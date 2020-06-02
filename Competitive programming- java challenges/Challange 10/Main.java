package com.challenges;

class Main {
    public static void main(String[] args) {
        int totalTravelDist=2052;
        int totalDaysTook=6;
        int numberOfStops=2;
        int distPerDay=totalTravelDist/totalDaysTook;
        System.out.println("Travel per day: "+distPerDay"miles");
        System.out.println("Number of stops: "+numberOfStops);
        System.out.println("Average distance between two stops: "+(distPerDay/numberOfStops)*1.6/*1.6km in one mile*/);
    }
}