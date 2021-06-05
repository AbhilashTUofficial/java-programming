package com.learn;

public class Main {

    public static void main(String[] args) {
	int[] numbs={30,20,10};
	int smallNum=numbs[0];
	for(int i=0;i<=2;i++){
	    if(smallNum>numbs[i]){
	        smallNum=numbs[i];
        }
    }
		System.out.println(smallNum);
    }
}
