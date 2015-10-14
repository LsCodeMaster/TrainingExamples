package com.sapient.employee;
import com.sapient.job.*;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr = new HR();
		Finance f = new Finance();
		Employee employee1 = hr.recruit("I");
		if (employee1 != null) {
			f.processSalary(employee1);
		}
		Employee employee2 = hr.recruit("F");
		if (employee2 != null) {
			f.processSalary(employee2);
		}
		Employee employee3 = hr.recruit("C");
		if (employee3 != null) {
			f.processSalary(employee3);
		}
		int[][] num;
		num = new int[5][];
		int x1[] = {1,2,3,4};
		num[0] = x1;
		int x2[] = {5,6,7,8};
		num[1] = x2;
		int x3[] = {9,6,4,56,7};
		num[2] = x3;
		int x4[] = {5,6,6,4};
		num[3] = x4;
		int x5[] = {4,6,34};
		num[4] = x5;

		int arr[] = {1,2,3,4,45,56,7,7,7,8,8,87,5,7};
		System.out.println(hr.avarageSalary(arr));
		System.out.println(hr.avarageSalary(num));
	}

}
