package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestFunctionalInterface {

	
	public static void main(String[] args) {
		
		FuntionInter fi = (str)->{ return (str+" srinivas");};
		String str = fi.myMethod("Heloo");
		System.out.println(str);
		
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
		
	}
}
