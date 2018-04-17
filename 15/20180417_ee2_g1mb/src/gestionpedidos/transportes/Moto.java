package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.*; 

@Programacion2 (
	nombreAutor1 = "nombre",                 // (del alumno 1)
	apellidoAutor1 = "apellido1 apellido2",  // (del alumno 1)
	emailUPMAutor1 = "usr@alumnos.upm.es",   // (del alumno 1)	
	nombreAutor2 = "nombre",                 // (del alumno 2 si lo hay)
	apellidoAutor2 = "apellido1 apellido2",  // (del alumno 2 si lo hay)
	emailUPMAutor2 = "usr@alumnos.upm.es"    // (del alumno 2 si lo hay)
)

public class Moto {
	private String codigo;
	private double eurosPKm = 2;// cada moto puede negociar un precio distinto	
	private Mapa mapa;
	
	public Moto(String codigo, Mapa mapa){
		this.codigo = codigo;
		this.mapa = mapa;
	}		
	
	public double coste(String codOrigen, String codDestino){
		// TO-DO
		return 0;
	}
	
	public double coste(String codDestino){
		// TO-DO
		return 0;
	}	
	
	public String getCodigo() {
		return codigo;
	}
	
	public double getEurosPKm() {
		return eurosPKm;
	}

	public void setEurosPKm(double eurospkm) {
		this.eurosPKm = eurospkm;
	}
	

}
