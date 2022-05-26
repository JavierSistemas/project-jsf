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
		 Empleado empleadoNetflix = new Empleado();
		 Empleado empleadoAmazon= new Empleado();
		 Empleado empleadoHP= new Empleado();
		 Empleado empleadoOracle= new Empleado();
		 Empleado empleadoDeloitte= new Empleado();
		 Empleado empleadoDisney= new Empleado();
		 
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
		 
		 empleadoNetflix.setNombre("Netflix");
		 empleadoNetflix.setPrimerApellido("Prime");
		 empleadoNetflix.setSegundoApellido("Bitel");
		 empleadoNetflix.setPuesto("Senio DBA");
		 empleadoNetflix.setEstatus(true);

		 empleadoAmazon.setNombre("Juan");
		 empleadoAmazon.setPrimerApellido("Perez");
		 empleadoAmazon.setSegundoApellido("Gutierrez");
		 empleadoAmazon.setPuesto("Android 5");
		 empleadoAmazon.setEstatus(true);
		 
		 empleadoHP.setNombre("Ramón");
		 empleadoHP.setPrimerApellido("Valdes");
		 empleadoHP.setSegundoApellido("Tururu");
		 empleadoHP.setPuesto("Senio PrimeFaces");
		 empleadoHP.setEstatus(true);
		 
		 empleadoOracle.setNombre("Carlos");
		 empleadoOracle.setPrimerApellido("Billagran");
		 empleadoOracle.setSegundoApellido("Kikin");
		 empleadoOracle.setPuesto("Flex Box");
		 empleadoOracle.setEstatus(true);
		 
		 empleadoDeloitte.setNombre("Edgar");
		 empleadoDeloitte.setPrimerApellido("Vivar");
		 empleadoDeloitte.setSegundoApellido("Sancho");
		 empleadoDeloitte.setPuesto("Master  .Net");
		 empleadoDeloitte.setEstatus(true);
		 
		 empleadoDisney.setNombre("Godines");
		 empleadoDisney.setPrimerApellido("Tres");
		 empleadoDisney.setSegundoApellido("Patines");
		 empleadoDisney.setPuesto("Software Enginere");
		 empleadoDisney.setEstatus(true);
		 
		 
		 empleados.add(empleadoIBM);
		 empleados.add(empleadoMicrosof);
		 empleados.add(empleadoApple);
		 empleados.add(empleadoNetflix);
		 empleados.add(empleadoAmazon);
		 empleados.add(empleadoHP);
		 empleados.add(empleadoOracle);
		 empleados.add(empleadoDeloitte);
		 empleados.add(empleadoDisney);
		 
		 
		 
		 return empleados;
		 
	 }
}
















