package principal;

import java.awt.Color;

import controlador.Controlador;
import vista.VistaTeclado;

public class Ppal {

	public static void main(String[] args) {
		
		VistaTeclado mi_vista = new VistaTeclado();
		Controlador.getInstancia().registrarVista(mi_vista);
		mi_vista.asociar_controlador(Controlador.getInstancia());
		mi_vista.setResizable(true);
		mi_vista.setVisible(true);

	}
	
}
