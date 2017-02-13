package alura;

public class Usuario {

	private String login;
	private String senha;
	private String email;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean validarEmail(){
		return email.contains("@");
	}
	
	public boolean validarSenha(){
		return senha.length() > 8;
	}
	
}
