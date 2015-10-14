package com.sapient.sample.helloservice;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import com.sapient.sample.service.HelloService;
import com.sapient.sample.service.impl.HelloServiceImpl;

public class HelloServiceFactory implements ServiceFactory {

	private int usageCounter = 0;

	public Object getService(Bundle bundle, ServiceRegistration

	registration) {

		System.out.println("Create object of HelloService for " +

		bundle.getSymbolicName());

		usageCounter++;

		System.out.println("Number of bundles using service " +

		usageCounter);

		HelloService helloService = new HelloServiceImpl();

		return helloService;

	}

	public void ungetService(Bundle bundle, ServiceRegistration

	registration, Object service) {

		System.out.println("Release object of HelloService for " +

		bundle.getSymbolicName());

		usageCounter--;

		System.out.println("Number of bundles using service " +

		usageCounter);

	}

}