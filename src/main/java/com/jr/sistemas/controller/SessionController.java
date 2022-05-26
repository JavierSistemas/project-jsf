package com.jr.sistemas.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.jr.sistemas.dto.UsuarioDTO;

/**
 * 
 * @author Jreye
 * Clase que se encarga de mantener la información del usuario que ingresa al aplicativo en sesión.
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que se mantendrá en sesión
	 */
	private UsuarioDTO usuarioDTO;

	
	/**
	 * Inicializa la sesión del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en sesión.");
	}
	
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
