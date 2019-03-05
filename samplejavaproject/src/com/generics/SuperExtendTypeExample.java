package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface lamdaExpression{
	String method(String s1,String s2);
}



public class SuperExtendTypeExample {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		Consumer<Integer> action = System.out::println;
		 
		numberList.stream().filter(n -> n%2  == 0).forEach( action );
		
		ArrayList<String> stringList = new ArrayList<>(Arrays.asList("ajith","billa"));
		List<String> list = stringList.stream().filter((ele)->ele.startsWith("a")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(list);
		
		lamdaExpression le = (s1,s2)-> s1+s2;
		
		System.out.println(le.method("rao", "sri"));
	    
	}

	public static void genericExtendMethod(List<Fruit> basket) {

		List<? extends Fruit> list = basket;

		for (Fruit f : list) {
			f.method();
		}

	}
	public static void genericSuperMethod(List<Fruit> basket) {

		List<? super Apple> list = basket;
		list.add(new Apple());

	}

}

class Fruit {

	public void method() {
		System.out.println("fruit method");
	}

}

class Apple extends Fruit {

	public void method() {
		System.out.println("apple method");
	}
}

class OotyApple extends Apple {
	public void method() {
		System.out.println("ootyapple method");
	}
}