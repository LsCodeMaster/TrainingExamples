package web.sapient.main;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private String name;
	private Map map;
	public Employee(String name, HashMap map){
		this.name = name;
		this.map = map;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Employee(){
		
	}
}
