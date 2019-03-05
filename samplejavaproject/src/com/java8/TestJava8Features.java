package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class TestJava8Features {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		//differnt ways of using consumer
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		};
		Consumer<Integer> action = System.out::println;

		Consumer<Integer> lamda = (i) -> {
			System.out.println(i);
		};
		Consumer<Integer> functionalConsumer = new ConsumerImpl<Integer>();
		
		Consumer<Integer> functionrMethodRef = new ConsumerImpl()::accept;
		
		Consumer<Integer> functionrMethodConsRef = ConsumerImpl::new;
		
		numberList.stream().forEach(functionrMethodConsRef);
	}

}
