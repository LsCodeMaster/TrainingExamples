package com.sapient.model.login;
import java.util.HashMap;

public class Login {
	private String uname, pword;
	HashMap<String, String> users;

	public Login(String uname, String pword){
		initialize();
		this.uname = uname;
		this.pword = pword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}
	
	public boolean checkPassword(){
		return false;
	}
	
	public boolean checkUsername(){
		return false;
	}
	
	public void initialize(){
		if (users==null){
			users.put("danielle@gmail.com", "abc@123");
			users.put("ian@yahoo.com", "123@abc");
			users.put("harshit@hotmail.com", "a1b2c3!");
			users.put("jiaju@sapient.com", "!1a2b3c");
			users.put("alex@yahoo.com", "c0c0nut&");
		}
	}
	
	public boolean validateLogin(){
		
		if(users.containsKey(uname) && users.get(uname) == pword)
			return true;
		else
			return false;
	}
}
