package com.jr.sistemas;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * 
 * @author Jreye
 * Clase que permite controlar el funcionamiento con la pantalla de long.xhtml
 */
@ManagedBean
public class LoginController 
{
	/**
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * Contraseña que ingresa en el login
	 */
	private String password;
	
	/**
	 * Método que permite intrar a la pagina princiapl del proyecto.
	 */
	public void ingresar() {
		
		if (usuario.equals("javier") && password.equals("123")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("loginForm:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe.", " "));
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("loginForm:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de logueo", "Las credenciales son incorrectas."));
		}
		System.out.println("Usuarios: "+usuario);
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
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
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
