package com.generics;

public class GenericStatusBuilder extends StatusBuilder<Employee, Salary>{

	
	@Override
	public void init(Employee objInit) {
		// TODO Auto-generated method stub
		System.out.println(objInit.getName());
		
	}

	@Override
	public Salary getDto() throws Exception {
		// TODO Auto-generated method stub
		return this.packager.getDto();
	}

	@Override
	public void buildRequestDetails() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildStatus() throws Exception {
		// TODO Auto-generated method stub
		GenericPackager pac = (GenericPackager)this.packager ;
		pac.packageData();
		
		
	}
	

}
