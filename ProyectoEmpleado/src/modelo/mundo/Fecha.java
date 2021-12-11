package modelo.mundo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor
	public Fecha (int pDia, int pMes, int pAnio) {
		dia = pDia;
		mes = pMes;
		anio = pAnio;
	}
	//Metodos analizadores
	public int  getDia() {
		return dia;
	}
	public int getMes() {
		return  mes;
	}
	public int getAnio() {
		return anio;
	}
	//Metodo funcionales
	public int darDiferenciaEnMeses (Fecha pFecha) {
		int numeroMeses = 0;
		int difAnios = anio - pFecha.getAnio()*12;
		int difMeses = 0;
		if (mes < pFecha.getMes()) {
			 difMeses = mes  -pFecha.getMes();
		}
		int difDias = 0;
		if (mes < pFecha.getMes()) {
		}
		numeroMeses = difAnios + difAnios + difMeses + difDias;
		return numeroMeses;
		
	}
	//dd-mm-aaaa
	public String toString() {
		return dia +"-" + mes + "-" + anio;
	}

}
