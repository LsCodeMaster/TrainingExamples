package com.sapient.cui.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Data<T>{
	private T value;

	public Data(){
		
	}
	public Data(T type){
		// TODO Auto-generated constructor stub
		this.setValue(type);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

class Employee{
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
class Engineer extends Employee{
	private String focusArea;

	public String getFocusArea() {
		return focusArea;
	}

	public void setFocusArea(String focusArea) {
		this.focusArea = focusArea;
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer> d = new Data<Integer>();
		d.setValue(new Integer(34));
		System.out.println(d.getValue());
		
		Data<Employee> eng= new Data<Employee>();
		Engineer engineer = new Engineer();
		eng.setValue(engineer);
		engineer.setEmpId(1922);
		engineer.setFocusArea("Computer Science");
		System.out.println(((Engineer)eng.getValue()).getFocusArea());
		System.out.println(eng.getValue().getEmpId());
		
		Set<Data> result = new HashSet<Data>();
		
		result.add(new Data<Integer>(new Integer(4)));
		result.add(new Data<Integer>(new Integer(3)));
		result.add(new Data<Integer>(new Integer(2)));
		result.add(new Data<Integer>(new Integer(4)));
		result.add(new Data<Integer>(new Integer(6)));
		
		Iterator<Data> iterator = result.iterator();
		Data name;
		while(iterator.hasNext()){
			name = iterator.next();
			System.out.println(name.getValue());
		}
		
		HashMap<Integer, Data> hashRes = new HashMap<Integer, Data>();
		
		hashRes.put(3, new Data(12));
		hashRes.put(5, new Data(23));
		hashRes.put(3, new Data(34));
		hashRes.put(8, new Data(56));
		
		Set<Integer> keys = hashRes.keySet();
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext()){
			Integer keyNum = iter.next();
			System.out.println(hashRes.get(keyNum).getValue());
		}
		System.out.println();
	}
}
