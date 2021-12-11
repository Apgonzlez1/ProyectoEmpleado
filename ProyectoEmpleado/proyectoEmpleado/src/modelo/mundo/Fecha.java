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
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	
	//Metodos funcionales
		//fecha1 23/04/2000   fecha2 15/08/2008
		public int darDiferenciaEnMeses (Fecha pFecha) {
			int numeroMeses = 0;
			int difAnios =  pFecha.getAnio() - anio* 12;
			int difMese = 0;
			if (mes < pFecha.getMes()) {
				difMese =  pFecha.getMes() - mes;
			}
			int difDias = 0;
			if (mes < pFecha.getMes()) {
				difDias = (pFecha.getDia() - dia )/ 30;
			}
			numeroMeses = difAnios + difMese + difDias;
			return numeroMeses;
		}
		//Formato Fecha dd-mm--aaaa || dd/mm/aaaa || aaaa-mm-dd
	public String toString() {
		return dia + "-"  + mes +"-" + anio;
	}

}
