/**
 * 
 */
package com.sapient.employee;

import com.sapient.job.Contract;
import com.sapient.job.FullTime;
import com.sapient.job.Intern;

/**
 * @author ilisze
 * 
 */
public class HR {
	public Employee recruit(String empType) {
		if (empType.equals("F")) {
			return new FullTime();
		} else if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Contract();
		} else
			return null;
	}
	public double avarageSalary(int[]... nums){
		int sum = 0;
		int length = 0;
		for (int x[] : nums){
			for (int xyVal: x){
				sum += xyVal;
				length++;
			}
		}
		return ((double) sum) / length;
	}
}
