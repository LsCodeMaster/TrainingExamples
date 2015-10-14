package web.sapient.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.sapient.login.Authentication;
import web.sapient.login.BasicAuthentication;

public class MainApp {
	public static void main(String[] args){
		Logger log = Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		log.info("Spring IoC instantiated");
		Authentication authentication = (Authentication) context.getBean("authBean");
		log.info("Authenticator obtained");
		boolean status = authentication.validateCredentials("saurabh", "pandey");
		log.info(status);
		
		if(authentication instanceof BasicAuthentication){
			((BasicAuthentication) authentication).setMaxAuth(5);
			log.info(((BasicAuthentication) authentication).getMaxAuth());
		}
		authentication = (Authentication) context.getBean("authBean");
		if(authentication instanceof BasicAuthentication){
			log.info(((BasicAuthentication) authentication).getMaxAuth());
		}
		
		Parent parent = (Parent) context.getBean("parBean");
		log.info(parent.getChild().getName());
		Employee emp = (Employee) context.getBean("empBean");
		log.info(emp.getMap().get("1"));
		log.info(emp.getMap().get("2"));
		log.info(emp.getMap().get("3"));
		
		parent = (Parent) context.getBean("parAutoConst");
		log.info(parent.getChild().getName());
		
		parent = (Parent) context.getBean("parAutoName");
		log.info(parent.getChild().getName());
		
		parent = (Parent) context.getBean("parAutoType");
		log.info(parent.getChild().getName());

		parent = (Parent) context.getBean("parAutoAnnotate");
		log.info(parent.getChild().getName());
		
		parent = (Parent) context.getBean("parQualifier");
		log.info(parent.getChild().getName());
		((AbstractApplicationContext) context).close();
	}
}
