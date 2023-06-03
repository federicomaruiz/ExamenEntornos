package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Modelo miModelo;
	private Vista vista;
	public Modelo getMiModelo() {
		return miModelo;
	}
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public Vista getVista() {
		return vista;
	}
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	
}
