package gestionpedidos.pedido;

import gestionpedidos.transportes.Moto;
import anotacion.*; 

@Programacion2 (
	nombreAutor1 = "nombre",                 // (del alumno 1)
	apellidoAutor1 = "apellido1 apellido2",  // (del alumno 1)
	emailUPMAutor1 = "usr@alumnos.upm.es",   // (del alumno 1)	
	nombreAutor2 = "nombre",                 // (del alumno 2 si lo hay)
	apellidoAutor2 = "apellido1 apellido2",  // (del alumno 2 si lo hay)
	emailUPMAutor2 = "usr@alumnos.upm.es"    // (del alumno 2 si lo hay)
)

public class Pedido {
	private Cliente cliente;
	private PlatoComida[] comidas;
	private Restaurante restaurante;
	private double importe;	
	private Moto transporte;
	
	
	public Pedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante) {		
		//TO-DO
	}
		
	
	public double coste(Moto moto){
		//TO-DO
		return 0;
	}
	
	public double getImporte(){
		return importe;
	}
	

	
	public Moto getTransporte() {
		return transporte;
	}

	public void setTransporte(Moto transporte) {
		this.transporte = transporte;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public Restaurante getRestaurante(){
		return restaurante;
	}
}
