package com.sapient.employee;

import com.sapient.job.FullTime;
import com.sapient.job.Intern;

public class Finance {
	public void processSalary(Employee e){
		e.netSalary();
		if (e instanceof FullTime){
			FullTime ft = (FullTime) e;
			ft.transport();
		}
		if (e instanceof Intern){
			Intern intrn = (Intern) e;
			intrn.transport();
		}
	}
}
