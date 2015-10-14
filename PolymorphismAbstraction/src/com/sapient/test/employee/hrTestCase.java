package com.sapient.test.employee;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.employee.*;
import com.sapient.job.*;

public class hrTestCase {
	String fullTime, intern, contract, empty, fullSpelling;
	int arr[] = {1,2,3,4,45,56,7,7,7,8,8,87,5,7};
	
	@Before
	public void setUp() throws Exception {
		fullTime = "F";
		intern = "I";
		contract = "C";
		empty = "";
		fullSpelling = "FullTime";
		
	}

	@After
	public void tearDown() throws Exception {
		fullTime = "";
		intern = "";
		contract = "";
		empty = "";
		fullSpelling = "";
	}

	@Test
	public void testEmptyRecruit(){
		HR hrTest = new HR();
		assertNull(hrTest.recruit(empty));
	}
	@Test
	public void testContractRecruit(){
		HR hrTest = new HR();
		assertTrue(hrTest.recruit(contract) instanceof Contract);
	}
	
	@Test
	public void testInternRecruit(){
		HR hrTest = new HR();
		assertTrue(hrTest.recruit(intern) instanceof Intern);
	}
	
	@Test
	public void testFullTimeRecruit(){
		HR hrTest = new HR();
		assertTrue(hrTest.recruit(fullTime) instanceof FullTime);
	}
	
	@Test
	public void testFullSpellingRecruit(){
		HR hrTest = new HR();
		assertNull(hrTest.recruit(fullSpelling));
	}	

	@Test
	public void testAvarageSalary() {
		HR hrTest = new HR();
		double expectedValue = 17.642857142857142;
	}

}
