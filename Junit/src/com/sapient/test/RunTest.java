package com.sapient.test;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.sapient.test.ArithmaticTestCase4;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(ArithmaticTestCase4.class);
		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
