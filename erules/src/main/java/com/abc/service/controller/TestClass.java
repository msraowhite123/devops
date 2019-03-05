package com.abc.service.controller;

import java.io.FileNotFoundException;

class A extends AbClass {
	public void method() throws Exception {
		System.out.println("A method");
	}

	@Override
	protected void methos() {
		// TODO Auto-generated method stub

	}
}

public class TestClass extends A {

	public void method() throws FileNotFoundException {
		System.out.println("A method");
	}

	public static void main(String[] args) {
		String str = "1971_05_25_07:00";
		if (str !=null && !str.isEmpty() && str.contains("-")) {
			System.out.println("before "+str);
			str = str.substring(0,str.lastIndexOf("-"));
			System.out.println("after "+str);
			
		} else {
			System.out.println("not str");
		}
	}

}
