package modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

public class Mecanografia extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel cajaTexto;
	ArrayList<String> frases = new ArrayList<String>();
	
	public Mecanografia() {
		super();
		this.setText("");
		frases.add("Me he enfrentado a muchos dioses autoproclamados.");
		frases.add("Cuando miro la cima de la montaña, en mi mente ya he fracasado. Es entonces que empiezo a escalar.");
		frases.add("El dolor es temporal, la victoria es eterna.");
		frases.add("No te conviertas en una bestia para derrotar a otra");
		frases.add("El progreso llega gota a gota");
		frases.add("Que nos esta sucediendo Kayn, soliamos ser muy buenos juntos");
		frases.add("A lo hecho, pecho");
		frases.add("El comportamiento de ella es impecable");
		frases.add("Los vampiros son seres inventados, como los duendes, los gremlins y los esquimales");
		frases.add("No te ubico Simpson, a veces pareces que eres raza pero luego te juntas..");
		frases.add("Que elegancia la de Francia");
	}
	
	public String getFrase() {		
		Random alAzar = new Random();
		
		int indice = alAzar.nextInt(frases.size());	
		
		return frases.get(indice) ;		
	}

	public void Empezar() {
		this.setText(getFrase());
	}
	
	public void UpdateText(char c) {
		String frase = this.getText();
		if(frase.length() > 0) {
			if(c == frase.charAt(0)) {
				frase=frase.substring(1,frase.length());
			}
		}
		
		this.setText(frase);
	}

}
