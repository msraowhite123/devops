/*package com.abc.service.controller;

import org.drools.compiler.kproject.ReleaseIdImpl;
import org.drools.core.SessionConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.springframework.stereotype.Component;


@Component
public class WebConfigurationKiesessionimpl implements WebConfigurationKiesession {
	public static final String USERNAME = "kieserver";
	public static final String PASSWORD = "kieserver1!";
	public static final String SERVER_URL = "http://localhost:8080/kie-server/services/rest/server";
	public static final String CONTAINER = "testcontainer";
	@Override
	public KieSession loadDroolsConfiguration() {
		KieContainer kieContainer = null;
		KieSession kieSession = null;
		// TODO Auto-generated method stub
		try {
			System.out.println("***********************************LOADING DROOLSSSS*******************************");
			// String url =
			// "http://localhost:8080/kie-wb/maven2/com/lakc/Lakcservices/1.0/Lakcservices-1.0.jar";
			ReleaseIdImpl releaseId = new ReleaseIdImpl("com.abc.service", "erules", "2.0.0");
			KieServices ks = KieServices.Factory.get();
			kieContainer = ks.newKieContainer(releaseId);
			// KieScanner kScanner = ks.newKieScanner(kieContainer);
			KieSessionConfiguration conf = SessionConfiguration.getDefaultInstance();
			kieSession = kieContainer.newKieSession(conf);
			System.out.println("SESSION >>>>>>>>>>>>>>>"+kieSession.getKieBase());
			System.out.println("***********************************LOADING DROOLSSSS*******************************");
			return kieSession;
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return kieSession;
	}

	
	public KieSession loadfromserver() {
		KieSession kieSession = null;
		String url = "D:/FINALDEMO/apache-tomcat-7.0.57-windows-x64/apache-tomcat-7.0.57/lib/com/digitas/michelin/kieworkbench/1.0/kieworkbench-1.0.jar";
		ReleaseIdImpl releaseId = new ReleaseIdImpl("com.digitas.michelin", "kieworkbench", "1.0");

		KieServices ks = KieServices.Factory.get();

		ks.getResources().newUrlResource(url);

		KieContainer kieContainer = ks.newKieContainer(releaseId);

		// check every 5 seconds if there is a new version at the URL
		KieScanner kieScanner = ks.newKieScanner(kieContainer);
		kieScanner.start(15000L);
		KieSessionConfiguration conf = SessionConfiguration.getDefaultInstance();
		kieSession = kieContainer.newKieSession(conf);
		return kieSession;
	}


	@Override
	public KieContainer createKieContainerForProject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
*/