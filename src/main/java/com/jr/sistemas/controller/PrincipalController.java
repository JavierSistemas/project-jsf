package com.jr.sistemas.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jr.sistemas.entity.Empleado;
import com.jr.sistemas.services.EmpleadoService;

/**
 * 
 * @author Jreye
 * Clase controller que se encarga de procesar infomración para la pantalla principal
 *
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	private EmpleadoService servicio = new EmpleadoService();
	
	/**
	 * Método que se encarga de inicializar la informacón de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleado();
	}
	
	
	public void consultarEmpleado() {
		this.empleados = this.servicio.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}





































