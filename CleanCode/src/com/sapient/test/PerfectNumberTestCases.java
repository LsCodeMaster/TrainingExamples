package com.sapient.test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.perfect.PerfectNumber;

public class PerfectNumberTestCases {

	@Test
	public void testPerfectNumberConstructor() {
		PerfectNumber perfectObject = new PerfectNumber(2);
		assert (perfectObject instanceof PerfectNumber);
		PerfectNumber perfectObject2 = new  PerfectNumber();
		assert (perfectObject2 instanceof PerfectNumber);
	}
	
	@Test
	public void testGetSetPerfectNumber(){
		PerfectNumber perfectObject = new PerfectNumber();
		int setNum = 3;
		perfectObject.setNumber(setNum);
		int getNum = perfectObject.getNumber();
		assert getNum == setNum;
	}
	
	@Test
	public void testGetProperDivisors(){
		int num = 8;
		PerfectNumber perfectObject = new PerfectNumber(num);
		Vector<Integer> properDivisors = perfectObject.getProperDivisors();
		for (int divisor : properDivisors){
			assert ((num % divisor) == 0);
		}
	}
	
	@Test
	public void testNoNegativeNumber(){
		int num = -8;
		PerfectNumber perfectObject = new PerfectNumber(num);
		assertFalse(perfectObject.isPerfectNumber());
		num = 0;
		perfectObject.setNumber(num);
		assertFalse(perfectObject.isPerfectNumber());
	}
	
	@Test
	public void testIsPerfectNumber(){
		int num = 8;
		PerfectNumber perfectObject = new PerfectNumber(num);
		assert perfectObject.isPerfectNumber();
	}
	
	@Test
	public void testIsNotPerfectNumber(){
		int num = 12;
		PerfectNumber perfectObject = new PerfectNumber(num);
		assertFalse(perfectObject.isPerfectNumber());
	}
}
