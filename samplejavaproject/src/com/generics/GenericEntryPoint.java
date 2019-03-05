package com.generics;

public class GenericEntryPoint {

	public static void main(String[] args) throws Exception {
		EntryPoint epoint = new EntryPoint();
		epoint.handleStatus();
	}
}

class EntryPoint {
	StatusBuilder<Employee, Salary> statsBuilder;

	public void handleStatus() throws Exception {

		statsBuilder = new GenericStatusBuilder();
		statsBuilder.init(new Employee("srinivas"));
		statsBuilder.setPackager(new GenericPackager());
		statsBuilder.buildStatus();
		Salary sal = statsBuilder.getDto();
		System.out.println(sal.getSal());

	}
}
