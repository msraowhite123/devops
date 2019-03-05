package com.abc.service.controller;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.drools.core.command.impl.GenericCommand;
import org.kie.api.KieServices;
import org.kie.api.command.BatchExecutionCommand;
import org.kie.api.runtime.KieSession;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.service.doccollection.EDocRule;

@Controller
public class HelloController {
	/*@Autowired
	KieSession ksession;*/
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		EDocRule edoc= new EDocRule(); 
		edoc.setCompanyCode("ABTECH");
		edoc.setPackageCode("1984");
		String url = "http://localhost:8080/kie-server/services/rest/server";
		String username = "kieserver";
		String password = "kieserver1!";
		String container = "erule";
		String session = "defaultKieSession";

		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(url, username, password);
		Set<Class<?>> allClasses = new HashSet<Class<?>>();
		allClasses.add(EDocRule.class);
		config.addJaxbClasses(allClasses);

		KieServicesClient client  = KieServicesFactory.newKieServicesClient(config);
		RuleServicesClient ruleClient = client.getServicesClient(RuleServicesClient.class);
		List<GenericCommand<?>> commands = new ArrayList<GenericCommand<?>>();
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newInsert(edoc,""));
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newFireAllRules());
		BatchExecutionCommand batchCommand = KieServices.Factory.get().getCommands().newBatchExecution(commands,session);
		ServiceResponse<String> response = ruleClient.executeCommands(container, batchCommand);
		System.out.println(response.getResult());
		
		/*ksession.insert(edoc);
		ksession.fireAllRules();*/
		model.addAttribute("message", "Spring  MVC Hello World");
		return "hello";

	}

	@RequestMapping(value = "/{cname}/{packagecode}", method = RequestMethod.GET)
	public ModelAndView helloDrools(@PathVariable("cname") String cname,
			@PathVariable("packagecode") String packagecode) throws JAXBException {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", cname);
		
		EDocRule edoc= new EDocRule(); 
		edoc.setCompanyCode(cname);
		edoc.setPackageCode(packagecode);
		String url = "http://localhost:8080/kie-server/services/rest/server";
		String username = "kieserver";
		String password = "kieserver1!";
		String container = "erule";
		String session = "defaultKieSession";

		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(url, username, password);
		Set<Class<?>> allClasses = new HashSet<Class<?>>();
		allClasses.add(EDocRule.class);
		config.addJaxbClasses(allClasses);

		KieServicesClient client  = KieServicesFactory.newKieServicesClient(config);
		RuleServicesClient ruleClient = client.getServicesClient(RuleServicesClient.class);
		List<GenericCommand<?>> commands = new ArrayList<GenericCommand<?>>();
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newInsert(edoc,""));
		commands.add((GenericCommand<?>) KieServices.Factory.get().getCommands().newFireAllRules());
		BatchExecutionCommand batchCommand = KieServices.Factory.get().getCommands().newBatchExecution(commands,session);
		ServiceResponse<String> response = ruleClient.executeCommands(container, batchCommand);
		System.out.println(response.getResult());
		/*JAXBContext jaxbContext = JAXBContext.newInstance(EDocRule.class);
		StringReader sr = new StringReader(response.getResult());
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		EDocRule customer = (EDocRule) jaxbUnmarshaller.unmarshal(sr);
		System.out.println(customer);*/

		return model;

	}

}