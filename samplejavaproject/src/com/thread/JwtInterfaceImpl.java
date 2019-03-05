package com.thread;

public class JwtInterfaceImpl implements JwtInterface{
	
	private String token ="b4Plhj0KePT4gFMICEeEUERcyvUz7xlAW5meg1NoQu1nmEUzJId8rTodvLySXb0h";
	

	@Override
	public String getJwtToken() {
		// TODO Auto-generated method stub
		return this.token;
	}

	@Override
	public String getSubect() {
		// TODO Auto-generated method stub
		return "subject";
		
	}

}
