package com.jr.sistemas.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import com.jr.sistemas.dto.UsuarioDTO;

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
	 * Bean que mantiene la información en session, se inyecta.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	/**
	 * Método que permite intrar a la pagina princiapl del proyecto.
	 */
	public void ingresar() {
		
		if (usuario.equals("javier") && password.equals("123")) {
			try {
				UsuarioDTO usuarioDTO= new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
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

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
}
