package modelo.mundo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Principal {
	private static final String String = null;

	public static void main (String[]args) {
		//TODO Auto-generated metod stub
		Scanner lect = new Scanner (System.in);
		Scanner sn = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		
		
		//Declarar variables para los datos del empleado
		String nombreEmple;
		String apellidoEmple;
		int genero; //1 femenino || 2 masculino
		double salarioEmple;
		int dia=0, mes= 0 , anio =0;
		 
		Fecha fechaNac;
		Fecha fechaIngreso;
		
		//Instanciar un objecto
		Empleado miempleado = null;
		 
		 boolean salir= false;
		 int opcion =0;
		 
		 while(!salir) {
		System.out.println("\n|------------------------------------------------------|");
		System.out.println("\n| **  M   E   N  U     E   M  P  L   E   A  D  O  **   |");
		System.out.println("\n|        ****Ingrese una opcion del Menu*****          |");
		System.out.println("\n|------------------------------------------------------|");
		System.out.println("\n|  Opcion 1:ingresar datos del empleado                |");
		System.out.println("\n|  Opcion 2:ingresar edad del empleado                 |");
		System.out.println("\n|  Opcion 3:ingresar antiguedad del empleado           |");
		System.out.println("\n|  Opcion 4:ingresar prestaciones del empleado         |");
		System.out.println("\n|  Opcion 5:Visualizar informacion del Empleado        |");
		System.out.println("\n|  Opcion 6:Salir                                      |");
		System.out.println("\n|------------------------------------------------------|");
		 try {
			 System.out.print("Elige un opcion del MENU del 1-6");
				opcion = sn.nextInt(); 
		 }catch(InputMismatchException e ) {
			 System.out.print(".....Debe inresar un numero del 1-6.......\n");
			 opcion =6;
			 e.printStackTrace();
		 }
		
		
		
		switch (opcion) {
		case 1:
			System.out.println("|-------I N G R E S O   C O N  E X I T  O------|");
			System.out.println("Ingrese los datos del Empleado");
			System.out.println("Nombre: ");
			nombreEmple= lect.next();
			System.out.println("Apellido: ");
			apellidoEmple=lect.next();
			 do {
		        	try {
						System.out.println("Ingrese Genero (1-Femenino, 2-Masculino): ");
						//Colocar while
						genero= entrada.nextInt();
									
					}
					catch(InputMismatchException e) {
						System.out.println("Debe ingresar solo números ");
						genero = 0;
						//genero= scanner.nextInt();
						//e.printStackTrace();
						entrada.nextInt();
					}
		        }while (genero<1 || genero>2);

			do {
				try {
					System.out.println("||    Ingrese su Salario entre: **400-700**      ||");
			        salarioEmple = entrada.nextDouble();
				}
				catch(InputMismatchException e) {
					System.out.println("Ingrese el salario correcto: ");
					salarioEmple = 0;
					e.printStackTrace();	
				}
			}while (salarioEmple<300 || salarioEmple>500);
			
			do {
				System.out.println("||  Ingrese su Dia de Nacimiento: **01-31**           ||");
			    dia = entrada.nextInt();
			}while (dia<01 || dia>31);
			
			do {
	        	System.out.println("||  Ingrese su Mes |NUMERO| de Nacimiento: **01-12**  ||");
		        mes = entrada.nextInt();
	        }while (mes<01 || mes>12);
			
			do {
	        	System.out.println("||   Ingrese su Año de Nacimiento:**2000-2021**       ||");
		        anio = entrada.nextInt();
		        fechaNac= new Fecha (dia, mes,anio);
	        }while (anio<2000 || anio>2021);
			
			do {
	        	System.out.println("||   Ingrese Dia de ingreso: **01-31**               || ");
		        dia = entrada.nextInt();	
	        }while (dia<01 || dia>31);
	        
	        do {
	        	System.out.println("||   Ingrese Mes de ingreso: **01-12**                ||");
		        mes = entrada.nextInt();	
	        }while (mes<01 || mes>12);
	        
	        do {
	        	 System.out.println("||  Ingrese Año de ingreso: **2000-2021**             ||");
			      anio = entrada.nextInt();
	        }while (anio<2000 || anio>2021);
			
			fechaIngreso= new Fecha (dia, mes,anio);
         miempleado=new Empleado();
			break;

		case 2:
			do
			{
			System.out.println("\nOpcion 2:");
			System.out.println("\nLa edad del Empleado es: ");
			miempleado.calcularEdad();
			}while(dia<1 || dia>0);
			break;
		case 3:
			do {
			try {
			System.out.println("\nOpcion 3:");
			System.out.println("\nIngresar Antiguedad del Empleado");
			}catch(NullPointerException e) {
				System.out.println("\nIngresar fecha de Antiguedad del Empleado");
				miempleado.calcularAntiguedad();
			}
			}while(mes<0 ||mes>1);
			break;
			
		case 4:
			try {
			System.out.println("\nOpcion 4:");
			System.out.println("\nCalcular Prestaciones del Empleado");
			}catch(NullPointerException e) {
				System.out.println("\nIngresar fecha para Calcular Prestaciones del Empleado");
				miempleado.calcularPrestaciones();
			}
			break;
		case 5:
			try {
			System.out.println("\nOpcion 5:");
			System.out.println("\nVisualizar informacion del Empleado");
			miempleado.mostrarDatos();
			}catch(NullPointerException e) {
				System.out.println("\n primero ingresar la informacion soliciada en cada una de la opciones");
				//miempleado.mostrarDatos();
			}
			break;
		case 6:
			
			System.out.println("\nOpcion 6:");
			System.out.println("\n SALIR ");
			salir =true;
			break;
		default:
			System.out.println("\n****Elige una opicón correcta ******");
			
			
			//return;
				}
	}
}
}	

