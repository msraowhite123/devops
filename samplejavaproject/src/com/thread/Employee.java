package com.thread;

class Employee implements Comparable<EmployeeS>{
	
	private String name;
	
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public int compareTo(EmployeeS o) {
		EmployeeS f = (EmployeeS) o; 
        return this.age - f.age ;
    }

}
