package com.jr.sistemas.dto;

/**
 * 
 * @author Jreye
 * Clase que mentendrá la información del usuario en sesión.
 */
public class UsuarioDTO 
{
	private String usuario;
	private String password;
	/**
	 * @return the usuarios
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
