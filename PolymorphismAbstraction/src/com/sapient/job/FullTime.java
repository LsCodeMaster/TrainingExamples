/**
 * 
 */
package com.sapient.job;

import com.sapient.employee.Employee;

/**
 * @author ilisze
 * 
 */
public class FullTime extends Employee {
	public FullTime() {
		super("FullTime");
	}

	public void netSalary() {
		System.out.println("FullTime Employee's Salary");
	}
	
	public void transport() {
		System.out.println("FullTime Employee has been shiped to India");
	}
}
