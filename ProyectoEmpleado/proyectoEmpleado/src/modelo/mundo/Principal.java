package modelo.mundo;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner lect = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		//Empleado empleado1;
		Empleado empleado1= new Empleado();
		
		String nombreEmple="";
		String apellidoEmple="";
		int genero=0;
		String imagen="";
		double salario=0;
		Fecha fechaNac;
		Fecha fechaIngreso;
		
		// OPCIONES DEL SISTEMA
		/* 1. Ingrese datos del empleado.
			3. Calcular la edad del empleado.
			4. Calcular la antig�edad del empleado en la empresa.
			5. Calcular las prestaciones del empleado.
			6. Visualizar la informaci�n del empleado.
		*/
		
		System.out.println("Escoja una de las siguientes opciones");
		System.out.println("	1. Ingrese datos del empleado.");
		System.out.println("	2. Calcular la edad del empleado");
		System.out.println("	3. Calcular la antig�edad del empleado en la empresa");
		System.out.println("	4. Calcular las prestaciones del empleado.");
		System.out.println("	5. Visualizar la informaci�n del empleado");
		int opc = lect.nextInt();
		
		switch (opc) {
			case 1: 
				System.out.println("Ingrese los datos del Empleado");
				System.out.println("Nombre: ");
				nombreEmple= lect.next();
				System.out.println("Apellido: ");
				apellidoEmple=lect.next();
				System.out.println("G�nero (1=Masculino, 2=Femenino: ");
				genero=lect.nextInt();
				System.out.println("Salario (Dos decimales): ");
				salario=lect.nextDouble();
				//fechaNac=lect.nextInteger();
				//Fecha fechaIngreso;
				break;
			case 2: 
				System.out.println("Ud ha escogido la opci�n 2");
				empleado1.calcularEdad();
				break;
			case 3: 
				System.out.println("Ud ha escogido la opci�n 3");
				empleado1.calcularAntiguedad();
				break;
			case 4: 
				System.out.println("Ud ha escogido la opci�n 4");
				empleado1.calcularPrestaciones();
				break;
			case 5: 
				System.out.println("Ud ha escogido la opci�n 5");
				empleado1.mostrarInformaic�n();
				break;
			default:
				System.out.println("No ha escogido una opic�n correcta");
				
		}
		System.out.println("");
		System.out.println("");
		
	}

}
