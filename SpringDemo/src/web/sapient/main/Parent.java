package web.sapient.main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Parent {
	private Child child;
	static Logger log;
	static{
		log = Logger.getLogger(Parent.class.getName());
	}
	
	public Parent(){
		
	}

//	@Autowired
	public Parent(Child child){
		this.child = child;
	}
	public Child getChild() {
		return child;
	}
	
	@Autowired
	@Qualifier("child")
	public void setChild(Child child) {
		this.child = child;
	}
	@PostConstruct
	public void init(){
		log.info("Further Intitialized");
	}
	
	@PreDestroy
	public void destroying(){
		log.info("Bean is being Destroyed");
	}
}
