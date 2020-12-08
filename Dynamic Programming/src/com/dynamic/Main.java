package com.dynamic;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    /////////////////////////////////////////
	// Dynamic programming coding challenge//
    /////////////////////////////////////////
        HashMap map=new HashMap<String,Integer>();
        map.put("2,3",6);
        map.put("3,2",6);
        System.out.println(map.containsKey("3,2"));
    }
}
