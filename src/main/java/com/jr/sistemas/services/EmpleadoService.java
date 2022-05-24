package com.jr.sistemas.services;

import java.util.ArrayList;
import java.util.List;

import com.jr.sistemas.entity.Empleado;

/**
 * 
 * @author Jreye
 * Clase que permite realizar la lógica de negocio para empleado
 *
 */
public class EmpleadoService {
	 
	public List<Empleado> consultarEmpleados(){
		 List<Empleado> empleados = new ArrayList<>();
		 Empleado empleadoIBM = new Empleado();
		 Empleado empleadoMicrosof = new Empleado();
		 Empleado empleadoApple = new Empleado();
		 
		 empleadoIBM.setNombre("Diego");
		 empleadoIBM.setPrimerApellido("Paniagua");
		 empleadoIBM.setSegundoApellido("López");
		 empleadoIBM.setPuesto("Senio Developer Java");
		 empleadoIBM.setEstatus(true);
		 
		 empleadoMicrosof.setNombre("Lucas");
		 empleadoMicrosof.setPrimerApellido("Checha");
		 empleadoMicrosof.setSegundoApellido("Panfila");
		 empleadoMicrosof.setPuesto("Senio Developer Android");
		 empleadoMicrosof.setEstatus(false);
		 
		 empleadoApple.setNombre("Kity");
		 empleadoApple.setPrimerApellido("Chilindrino");
		 empleadoApple.setSegundoApellido("Robert");
		 empleadoApple.setPuesto("Senio Developer Angular");
		 empleadoApple.setEstatus(true);
		 
		 empleados.add(empleadoIBM);
		 empleados.add(empleadoMicrosof);
		 empleados.add(empleadoApple);
		 
		 return empleados;
		 
	 }
}
















