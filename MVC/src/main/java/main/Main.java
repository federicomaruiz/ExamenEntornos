package main;

import com.utad.model.*;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;


public class Main {

	public static void main(String[] args) {
		
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Vista vista = new Vista();
		
		vista.setModelo(miModelo);
		vista.setControlador(miControlador);
		miControlador.setMiModelo(miModelo);
		miControlador.setVista(vista);
		miModelo.setVista(vista);
		

	}

}
