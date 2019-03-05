package com.generics;

import java.util.HashMap;

public class TestJava8MapFeatures {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		map.forEach((k, V) -> {
			System.out.println(k + ":" + V);
		});

		map.keySet().stream().filter(K -> K.equalsIgnoreCase("A")).map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
