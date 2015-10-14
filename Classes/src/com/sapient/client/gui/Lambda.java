package com.sapient.client.gui;

interface Test {
	public void testing(int i);
}

class Execution {
	public void call(Test test, int value) {
		test.testing(value);
	}
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution exec = new Execution();
		exec.call((value) -> {
			System.out.println("testing1" + value);
		}, 3);
		exec.call((value) -> {
			while (value > 0) {
				System.out.println(value);
				value--;
			}
		}, 10);
		exec.call((value) -> {
			System.out.println("testing3" + value);
		}, 7);
	}

}
