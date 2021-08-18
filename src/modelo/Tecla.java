package modelo;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Tecla extends JLabel {
	
	private static final long serialVersionUID = 1L;
	String nombre;
	int alto, ancho, posx, posy, codigo;
	
	Border borde_press = BorderFactory.createLoweredBevelBorder();
	Border borde_relea = BorderFactory.createEtchedBorder();
	
	Color color_press = Color.red;
	Color color_relea = new Color(6, 147, 230);
	
	public Tecla(String nombre, int posx, int posy, int ancho, int alto,int codigo) {
		super();
		this.setText(nombre);
		this.setBounds(posx, posy, ancho, alto);
		this.codigo=codigo;
		this.setBorder(borde_relea);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
	}

	public void pulsar () {
			this.setBorder(borde_press);
			this.setOpaque(true);
			this.setBackground(color_press);	
	}
		
	public void soltar() { 
			this.setBorder(borde_relea);
			this.setBackground(color_relea);
	}
	
	public void setBorde_press(Border borde_press) {
		this.borde_press = borde_press;
	}
	
	public void setBorde_relea(Border borde_relea) {
		this.borde_relea = borde_relea;
	}
	
	/* Este metodo está para poder agregar una funcionalidad de mecanografia */
	public int getCodigo() {
		return codigo;
	}

}
