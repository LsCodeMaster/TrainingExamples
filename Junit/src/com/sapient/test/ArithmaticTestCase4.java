package com.sapient.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.sapient.math.Arithmatic;

public class ArithmaticTestCase4 {
	int firstNumber, secondNumber;
	
	/**
	 * Test method for {@link com.sapient.math.Arithmatic#sum(int, int)}.
	 */
	@Test
	@Ignore
	public void testSum() {
		int expectedResult = 6;
		firstNumber = 2;
		secondNumber = 4;
		Arithmatic arithmaticObjectRef = new Arithmatic();
		int actualResult = arithmaticObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
	}

}
