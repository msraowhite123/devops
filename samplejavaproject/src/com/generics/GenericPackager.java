package com.generics;

public class GenericPackager extends Packager<Salary> {

	public void packageData(){
		this.dto = new Salary(2000);
		
	}
	
}
