package com.jr.sistemas.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * 
 * @author Jreye
 * Clase que se encarga de cerrar la sesión del usuario
 */
@ManagedBean
public class SessionCloseController {
	 
	@PostConstruct
	public void init() {
		System.out.println("Cerrando sesión...");
	}

	/**
	 * Método que cierra la sesión del usuario y regresa a la pantalla de login
	 */
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que permite rediccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionarse.
	 * @throws IOException, en caso de error al encontrar la página.	
	 * 
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
