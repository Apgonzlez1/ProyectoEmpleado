package modelo.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
	//Atributos
	private String nombreEmpleado ;
	private String apellidoEmpleado;
	private int genero; // 1 Femenido & 2 Masculino
	private String imagen;
	private double salario;
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	//Metodo constructor sin parametros
	 public Empleado() {
		 nombreEmpleado="";
		 apellidoEmpleado="";
		 genero=0;
		 imagen="";
		 salario=0.0; 
	 }
	 
	//Metodo constructor con parametros
	 public Empleado(String pNombreEmpleado, String pApellidoEmpleado,int pGenero, String pImagen, double pSalario) {
		 nombreEmpleado=pNombreEmpleado;
		 apellidoEmpleado=pApellidoEmpleado;
		 genero=pGenero;
		 imagen=pImagen;
		 salario=pSalario;
	 }

	
	 //Metodos analizadores (permiten obtener o modificar la informacion de los atributos )
		 //Getters(Obtener) // Setters () 
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public int getGenero() {
		return genero;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	
	public String getImagen() {
		return imagen;
	}

	public double getSalario() {
		return salario;
	}
	
	// metodo dar fecha actual
	
	public Fecha getFechaActual() {
		
		 GregorianCalendar gc = new GregorianCalendar( );

	        int dia = gc.get( Calendar.DAY_OF_MONTH );
	        int mes = gc.get( Calendar.MONTH ) + 1;
	        int anio = gc.get( Calendar.YEAR );
	       
	        Fecha fechaActual = new Fecha( dia, mes, anio );
	        return fechaActual;
	}
	

	//metodos Setters
	public void setEmpleado(String pNombreEmpleado, String pApellidoEmpleado,int pGenero, String pImagen, double pSalario) {
		 nombreEmpleado=pNombreEmpleado;
		 apellidoEmpleado=pApellidoEmpleado;
		 genero=pGenero;
		 imagen=pImagen;
		 salario=pSalario;
	}
	
	public void setSalario(double pSalario) {
		salario=pSalario;
	}
	
	//metodos funcionales 
	
	public int calcularAntiguedad() {
		
		int antiguedad=0;
	    antiguedad = fechaIngreso.darDiferenciaEnMeses( getFechaActual() ) / 12;
	    return antiguedad;
	}
	
	 public int calcularEdad( ){
		 	 
	        int edad = fechaNacimiento.darDiferenciaEnMeses( getFechaActual()) / 12;

	        return edad;
	    }

	public double calcularPrestaciones() {
		double prestaciones;
		prestaciones= (calcularAntiguedad() * getSalario())/12;
		return prestaciones; 
	}
	
	//Método que permite visualizar la información del empleado
	public void mostrarInformaicón() {
		System.out.println("La información del empleado es:");
		System.out.println("Nombre: "+getNombreEmpleado());
		System.out.println("Apellido: "+ getApellidoEmpleado());
		System.out.println("Género (Masculino 1), (Femenino 0)"+ getGenero());
		System.out.println("Fecha de Nacimiento: "+ getFechaNacimiento());
		System.out.println("Fecha de ingreso a la empresa: "+getFechaIngreso());
		System.out.println("Salario básico: "+getSalario());
		System.out.println("Prestaciones: "+calcularPrestaciones());
		System.out.println("Antiguedad: "+calcularAntiguedad()+" años.");
	}
	
	
}

