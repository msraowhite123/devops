package com.java8;

import java.util.function.Consumer;

public class ConsumerImpl<T> implements Consumer<T>{
	
	
	ConsumerImpl(){
		System.out.println("default cons");
	}
	
	public ConsumerImpl(String str){
		System.out.println(str);
	}
	public ConsumerImpl(Integer str){
		System.out.println(str);
	}

	@Override
	public void accept(T t) {
		System.out.println(t);
		
	}

}
