package data_class;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author ilisze
 *
 */
public class Customer {
private String fName;
private String lName;

public Customer(){
	
}

public Customer(String fName, String lName){
	this.setfName(fName);
	this.setlName(lName);
}

public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public Map<Integer,String> getDetails(){
	Map<Integer, String> m = new HashMap<Integer, String>();
	m.put(1, "abc");
	m.put(2, "sajkl");
	m.put(3, "jk");
	return m;
}

}
