/**
 * 
 */
package com.sapient.print;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @author ilisze
 *
 */
public class IntegerToString {
	private int number;
	final String[] singleDigits = {"zero","one","two","three","four", 
			"five","six","seven","eight","nine"};
	final String[] doubleDigits = {"","ten","eleven","twelve","thirteen","fourteen",
			"fifteen","sixteen","seventeen","eighteen","nineteen"};
	final String[] tenMultiples = {"", "", "twenty", "thirty", "fourty", "fifty", 
			"sixty", "seventy", "eighty", "ninety"};
	final String[] hundredPowers = {"hundred", "thousand", "million"};
	
	public IntegerToString(){
	}
	
	public IntegerToString(int num){
		setNumber(num);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int num) {
		this.number = num;
	}

	public int getHundredsPower() {
		int num = Integer.toString(number).length() + 2;
		return num/3;
	}
	
	public ArrayList<Integer> getSets(){
		int numSets = getHundredsPower();
		String numString = Integer.toString(number);
		int num = number;
		ArrayList<Integer> numberSets = new ArrayList<Integer>();  
		for(int index = 0; index<numSets; index++){
			int set = num % 1000;
			numberSets.add(set);
			num = num/1000;
		}
		return numberSets;
	}
	
	public void printString(){
		ArrayList<Integer> numSets = getSets();
		String numString = "";
		for(int set = 0; set < numSets.size(); set++){
			int firstSet = numSets.indexOf(set);
			String numSetString = Integer.toString(firstSet);
			int digitNum = numSetString.length();
			if(digitNum == 1){
				numSetString = singleDigits[firstSet];
			}
		}
	}
}
