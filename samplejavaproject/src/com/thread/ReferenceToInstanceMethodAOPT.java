package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethodAOPT {

	/**
	 * @param args
	 *            the command line arguments
	 */

	 class Person {

		private final String name;
		private final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;

		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		map.forEach((K,V)->{
			System.out.println(K);
			System.out.println(V);
		});
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		java.util.function.Consumer<Integer> actionlist = (p)->{System.out.println(p);};
		 
		numberList.forEach(actionlist);
		
		java.util.function.Consumer<String> keys = System.out::println;
		map.keySet().forEach(keys);

		// 1. Map entries
		java.util.function.Consumer<java.util.Map.Entry<String, Integer>> action = System.out::println;

		map.entrySet().forEach(action);

		// 2. Map keys
		java.util.function.Consumer<String> actionOnKeys = System.out::println;

		map.keySet().forEach(actionOnKeys);

		// 3. Map values
		java.util.function.Consumer<Integer> actionOnValues = System.out::println;

		map.values().forEach((i)->System.out.println("values "+i));
	}

	private static List listAllAges(List person, Function<Person, Integer> f) {
		List result = new ArrayList();
		person.forEach((x)->result.add(f.apply((Person)x)));
		//person.forEach(x -> result.add(f.apply((Person) x)));
		return result;
	}
}