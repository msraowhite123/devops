/*package com.abc.service.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;




@Component
public class KIEHelper {

	@Autowired
	WebConfigurationKiesession webConfigurationKiesession;
	
	private static KieSession ksession = null;
	
	private KIEHelper(){
		
	}
	public  KieSession getKieSession(){
		System.out.println(ksession);
		if( ksession ==null ) {
			ksession = webConfigurationKiesession.loadDroolsConfiguration();
		}		 
		System.out.println(ksession);
		return ksession;
	}
	
}
*/