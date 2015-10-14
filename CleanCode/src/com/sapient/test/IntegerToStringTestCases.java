package com.sapient.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.print.IntegerToString;

public class IntegerToStringTestCases {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void IntegerToStringConstructorTest() {
		IntegerToString testObject = new IntegerToString();
		assert testObject instanceof IntegerToString;
		int num = 1637624;
		IntegerToString testObejct = new IntegerToString(num);
		assert testObject instanceof IntegerToString;
	}

	@Test
	public void getHundredPowersTest(){
		int number = 7;
		IntegerToString testObject = new IntegerToString(1234234);
		int index = testObject.getHundredsPower();
		assert index == 3;
		testObject.setNumber(123);
		index = testObject.getHundredsPower();
		assert index == 1;
	}
	
	@Test
	public void getSetsTest(){
		int number = 1534654;
		IntegerToString testObject = new IntegerToString(number);
		ArrayList<Integer> expectedValue = new ArrayList<Integer>();
		expectedValue.add(654);
		expectedValue.add(534);
		expectedValue.add(1);
		ArrayList<Integer> actualValue = testObject.getSets();
		assert actualValue.equals(expectedValue);
	}
	
	
}
