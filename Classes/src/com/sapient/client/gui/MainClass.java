package com.sapient.client.gui;

interface Test1{
	public void testing1();
}
interface Test2{
	public void testing2();
}
interface Test3{
	public void testing3();
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(){
			@Override
			public void testing1() {
				// TODO Auto-generated method stub
				System.out.println("testint1");
			}
		};
		t1.testing1();
		Test2 t2 = new Test2() {
			@Override
			public void testing2() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
