/**
 * 
 */
package com.sapient.perfect;

import java.util.Vector;

/**
 * @author ilisze
 *
 */
public class PerfectNumber {
	private int number;
	
	/**
	 * get class variable number
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * set class variable number
	 * @return void
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Constructor to make object and set number to be tested
	 * @param num
	 */
	public PerfectNumber(int num){
		setNumber(num);
	}
	
	public PerfectNumber(){
		
	}
	
	/**
	 * iterate through 1...number/2 and add numbers which are proper divisors
	 * of the number
	 * @return Vector of integers
	 */
	public Vector<Integer> getProperDivisors(){
		int number = getNumber();
		Vector<Integer> divisors = new Vector<>();
		for (int num = 1; num < (number/2); num ++){
			if(number % num == 0)
				divisors.add(num);
		}
		return divisors;
	}

	/**
	 * Function to test if number is perfect Number
	 * @return boolean 
	 */
	public boolean isPerfectNumber() {
		// TODO Auto-generated method stub
		int number = getNumber();
		
		// assert number is positive
		if(number <1)
			return false;
		// test if sum of divisors equals number
		else{
			Vector<Integer> properDivisors = getProperDivisors();
			int sum = 0;
			for(int num : properDivisors){
				if(num != number)
					sum += num;
			}
			return (sum == number);
		}
			
	}
	
	
}
