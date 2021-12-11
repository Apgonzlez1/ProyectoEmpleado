package modelo.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
	//Atributos
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int genero;
	private String imagen;
	private double salario;
	
	private static Fecha fechaNacimiento ;
	private Fecha fechaIngreso;	
	
	//Metodo constructor sin parametros
	public Empleado () {
		nombreEmpleado = "";
		apellidoEmpleado = "";
		genero = 0;
		imagen = "";
		salario = 0.0;
			
	}
	
	//Metodo constructor con parametros
	public Empleado (String pNombreEmpleado, String pApellidoEmpleado, int pGenero, String pImagen, double pSalario) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen = pImagen;
		salario = pSalario;
	}
	
	//Metodos analizadores(Permiten obtener o modificar la informacion de los atribuos)
	//Getters(obtener) //Setters(Cambiar o modificar)
	public String getNombre() {
		return nombreEmpleado;
	}
	public String getApellido() {
		return apellidoEmpleado;
	}
	public int geGenero() {
		return genero;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public  Fecha getFchaIngreso() {
		return fechaIngreso;
	}
	public String getImagen() {
		return imagen;
	}
	public double getSalario() {
		return salario;
	}
	public static Fecha getFechaActual() {
		GregorianCalendar gc = new GregorianCalendar();
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int mes = gc.get(Calendar.MONTH);
		int anio = gc.get(Calendar.YEAR);
		
		Fecha fechaActual= new Fecha(dia, mes, anio);
		return fechaActual;
	}
	
	//metodo Setters
	public void setEmpleado(String pNombreEmpleado, String pApellidoEmpleado, int pGenero, String pImagen, double pSalario) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen =pImagen;
		salario = pSalario;
		
		
	}
	public void  setSalario (double pSalario) {
		salario = pSalario;
		
		
	}
	//metodos funcionales calcula la antiguedad en años
	public int calcularAntiguedad() {
	int antiguedad = 0;
	antiguedad = fechaIngreso.darDiferenciaEnMeses(getFechaActual()) / 12;
	return antiguedad ;
				
			}
	// metodo funcional calcula la edad del empleado en años
	
	public  int calcularEdad( ){
		 int edad=0;
	        edad = fechaNacimiento.darDiferenciaEnMeses( getFechaActual()) / 12;
	        return edad;
        /*Fecha hoy =  getFechaActual( );
		
        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;*/
    }
	//Metodo Funcional Calcular prestaciones
	public double calcularPrestaciones( )
    {
        int antiguedad = calcularAntiguedad( );
        double prestaciones = ( ( double ) ( antiguedad * salario ) ) / 12;
        return prestaciones;
    }
//Metodo que permite visualizar la informacion del empleado
	
		public void mostrarDatos() {
			System.out.println("\nDatos del Empleado");
			System.out.println("Nombre: "+nombreEmpleado);
			System.out.println("Apellido: "+ apellidoEmpleado);
			System.out.println("Genero: "+ genero);
			System.out.println("Edad: "+ calcularEdad());
			System.out.println("Salario: "+ salario);	
	}
}
