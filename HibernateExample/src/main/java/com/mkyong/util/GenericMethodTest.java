/*package com.mkyong.util;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {
	// generic method printArray
	public static <E> E printArray(E[] inputArray) {
		// Display array elements
		E[] response =new E[2];
		for (E element : inputArray) {
			System.out.printf("%s ", element);
			response = element;
		}
		System.out.println();
		return null;
	}

	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		List<String> list = new ArrayList();
		list.add("srini");
		List<String> list1 = new ArrayList();
		list1.add("vas");
		List[] alist = {list,list1};
		printArray(alist);

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array
	}
}
*/