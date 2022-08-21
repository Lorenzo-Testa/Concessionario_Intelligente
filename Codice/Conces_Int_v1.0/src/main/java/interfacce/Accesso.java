package interfacce;

public interface Accesso {

	public Sessione SignIn(String username, String password) ;
	public void Logout(Sessione s) ;
	
}
