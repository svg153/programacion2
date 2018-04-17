package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Moto;
import list.ArrayList;
import anotacion.*; 

@Programacion2 (
	nombreAutor1 = "nombre",                 // (del alumno 1)
	apellidoAutor1 = "apellido1 apellido2",  // (del alumno 1)
	emailUPMAutor1 = "usr@alumnos.upm.es",   // (del alumno 1)	
	nombreAutor2 = "nombre",                 // (del alumno 2 si lo hay)
	apellidoAutor2 = "apellido1 apellido2",  // (del alumno 2 si lo hay)
	emailUPMAutor2 = "usr@alumnos.upm.es"    // (del alumno 2 si lo hay)
)

public class GestionRepartoLocal {	
	private ArrayList<Moto> motosDisponibles;

	private String getCodList(ArrayList<?> disponibles) {
		String salida = "";
		for(int i=0; i<disponibles.size(); i++)
			salida += " " + ((Moto) disponibles.get(i)).getCodigo();
		return salida;
	}
	
	public String getDisponibles(){
		return "Motos Disponibles:" + getCodList(motosDisponibles) + System.lineSeparator();		
	}
		
	public GestionRepartoLocal(){
		this.motosDisponibles = new ArrayList<>();
	}
	
	public void add(Moto moto){
		this.motosDisponibles.add(this.motosDisponibles.size(), moto);
	}	
	
	
	// si no hay ninguna moto disponible, 
	// el atributo transporte de pedido se queda a null
	public void asignarPedido(Pedido pedido){
		//TO-DO
	}
	
	
	public void notificarEntregaPedido(Pedido pedido) {
		//TO-DO
	}
}
