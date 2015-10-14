package web.sapient.login;

public interface Authentication {
	public boolean validateCredentials(String usrName, String pass);
}
