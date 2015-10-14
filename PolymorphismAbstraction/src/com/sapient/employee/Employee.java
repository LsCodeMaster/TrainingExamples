/**
 * 
 */
package com.sapient.employee;

/**
 * @author ilisze
 * 
 */
public abstract class Employee {
	String empType;

	public Employee(String type) {
		this.empType = type;
	}

	public abstract void netSalary();
}
