package controlador;

import modelo.Tecla;
import vista.VistaTeclado;


public class Controlador {

	private static Controlador instancia;
			
	VistaTeclado vista_controller;
	
	private Controlador(){	}
	
	public static Controlador getInstancia(){
		if(instancia==null)
			instancia = new Controlador();
		return instancia;
	}
	
	public void registrarVista(VistaTeclado vista_controller) {
		this.vista_controller = vista_controller;
	}

	public void pulsarTecla(Tecla tecla) {		
		tecla.pulsar();						
	}
	
	public void soltarTecla(Tecla tecla) {	
		tecla.soltar();
	}
}
