package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericExample {

	public static  void main(String[] args) {

		GenericTypeClass<IndianAge> ia = new GenericTypeClass<IndianAge>(new IndianAge());
		GenericTypeClass<ForeingAge> f = new GenericTypeClass<ForeingAge>(new ForeingAge());
		GenericExample eg = new GenericExample();
		
		List<Integer> list  = new ArrayList<>();
		list.add(123);
		list.add(456);
		new GenericExample().add(list);
		
	}
	
	 <T> void add(List<? extends Integer> list ){
		 for(Integer  i : list){
			 System.out.println(i);
		 }
	}
	 
}

class GenericTypeClass<T extends GenericInterface> {

	private T objRef;

	GenericTypeClass(T t) {
		objRef= t;
		objRef.calculateAge(10);
	}

}

class Emp {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
