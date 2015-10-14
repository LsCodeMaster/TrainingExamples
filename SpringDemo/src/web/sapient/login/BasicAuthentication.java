package web.sapient.login;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicAuthentication implements Authentication{
	private int maxAuth;
	static Logger log;
	public BasicAuthentication(){
		log = Logger.getLogger(BasicAuthentication.class.getName());
		log.info("Authentication Initialized");
	}
	@Override
	public boolean validateCredentials(String usrName, String pass) {
		// TODO Auto-generated method stub
		if(usrName.equalsIgnoreCase("saurabh") && pass.equals("pandey"))
			return true;
		else
			return false;
	}
	public int getMaxAuth() {
		return maxAuth;
	}
	public void setMaxAuth(int maxAuth) {
		this.maxAuth = maxAuth;
	}

}
