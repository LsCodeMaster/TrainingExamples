package com.sapient.job;

import com.sapient.employee.Employee;

public class Contract extends Employee{
	public Contract() {
		super("Contract");
	}

	public void netSalary() {
		System.out.println("Contract Employee's Salary");
	}
}
