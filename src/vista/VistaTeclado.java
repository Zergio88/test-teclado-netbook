package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.MatteBorder;

import controlador.Controlador;
import modelo.BordeRedondo;
import modelo.Mecanografia;
import modelo.Tecla;

public class VistaTeclado extends JFrame implements KeyListener {
	
	 /* Serializacion sugerida */ 
	private static final long serialVersionUID = -7606444970459569020L;
	
	/* asociacion del controlador  */
	Controlador controlador_vista;
	
	public void asociar_controlador(Controlador controlador_vista) {
		this.controlador_vista = controlador_vista;
	}
	
	/* declaracion de variables */	
	Tecla esc,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,t_pause,t_imp,t_ins,t_sup, 
	simb_1,num1,num2,num3,num4,num5,num6,num7,num8,num9,num0, simb_2,simb_3,backspc,
	tabu,q,w,ee,r,t,y,u,i,o,p,simb_4,simb_5,t_enter, t_bMayus,a,s,d,f,g,h,j,k,l,
	simb_enie,simb_6,simb_7,t_enter2, shift_i, simb_8,z,x,c,v,b,n,m,simb_9,simb_10,guion,shift_d,arriba,
	ctrl1,fn,win,alt,spc,altgr,menu,ctrl2,izquierda,abajo,derecha;
	int presionado = 0;
	Color FondoForm = new Color(223, 245, 254);
	JButton jb_mecano;
	Mecanografia jl_mecano;
				
	public VistaTeclado() {		
		initialize();				
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {		
		int cod=e.getKeyCode();
		char caracter=e.getKeyChar();
		
		controlador_vista.MecanografiaUpdate(jl_mecano, caracter);
		
		// LE DIGO AL CONTROLADOR QUE CAMBIE EL ESTADO A ESA TECLA
		
		// simbolo 1
		switch (caracter) {
		case '|':
			controlador_vista.pulsarTecla(simb_1);
			break;
		case '¿':
			controlador_vista.pulsarTecla(simb_3);
			break;
		case 'ñ':
			controlador_vista.pulsarTecla(simb_enie);
			break;
		case '{':
			controlador_vista.pulsarTecla(simb_6);
			break;
		case '}':
			controlador_vista.pulsarTecla(simb_7);
			break;
		default:
			break;
		}
	
		 
		switch (cod) {
		case KeyEvent.VK_ESCAPE:
			controlador_vista.pulsarTecla(esc);
			break;
		case KeyEvent.VK_F1:
			controlador_vista.pulsarTecla(f1);
			break;
		case KeyEvent.VK_F2:
			controlador_vista.pulsarTecla(f2);
			break;
		case KeyEvent.VK_F3:
			controlador_vista.pulsarTecla(f3);
			break;
		case KeyEvent.VK_F4:
			controlador_vista.pulsarTecla(f4);
			break;
		case KeyEvent.VK_F5:
			controlador_vista.pulsarTecla(f5);
			break;
		case KeyEvent.VK_F6:
			controlador_vista.pulsarTecla(f6);
			break;
		case KeyEvent.VK_F7:
			controlador_vista.pulsarTecla(f7);
			break;
		case KeyEvent.VK_F8:
			controlador_vista.pulsarTecla(f8);
			break;
		case KeyEvent.VK_F9:
			controlador_vista.pulsarTecla(f9);
			break;
		case KeyEvent.VK_F10:
			controlador_vista.pulsarTecla(f10);
			break;
		case KeyEvent.VK_F11:
			controlador_vista.pulsarTecla(f11);
			break;
		case KeyEvent.VK_F12:
			controlador_vista.pulsarTecla(f12);
			break;
		case KeyEvent.VK_PAUSE:
			controlador_vista.pulsarTecla(t_pause);
			break;
		case KeyEvent.VK_PRINTSCREEN:
			controlador_vista.pulsarTecla(t_imp);
			break;
		case KeyEvent.VK_INSERT:
			controlador_vista.pulsarTecla(t_ins);
			break;
		case KeyEvent.VK_DELETE:
			controlador_vista.pulsarTecla(t_sup);
			break;
		case KeyEvent.VK_1:
			controlador_vista.pulsarTecla(num1);
			break;
		case KeyEvent.VK_2:
			controlador_vista.pulsarTecla(num2);
			break;
		case KeyEvent.VK_3:
			controlador_vista.pulsarTecla(num3);
			break;
		case KeyEvent.VK_4:
			controlador_vista.pulsarTecla(num4);
			break;
		case KeyEvent.VK_5:
			controlador_vista.pulsarTecla(num5);
			break;
		case KeyEvent.VK_6:
			controlador_vista.pulsarTecla(num6);
			break;
		case KeyEvent.VK_7:
			controlador_vista.pulsarTecla(num7);
			break;
		case KeyEvent.VK_8:
			controlador_vista.pulsarTecla(num8);
			break;
		case KeyEvent.VK_9:
			controlador_vista.pulsarTecla(num9);
			break;
		case KeyEvent.VK_0:
			controlador_vista.pulsarTecla(num0);
			break;
		case KeyEvent.VK_QUOTE:
			controlador_vista.pulsarTecla(simb_2);
			break;
		case KeyEvent.VK_BACK_SPACE:
			controlador_vista.pulsarTecla(backspc);
			break;
		case KeyEvent.VK_TAB:
				controlador_vista.pulsarTecla(tabu);
			break;
		case KeyEvent.VK_Q:
			controlador_vista.pulsarTecla(q);
			break;
		case KeyEvent.VK_W:
			controlador_vista.pulsarTecla(w);
			break;
		case KeyEvent.VK_E:
			controlador_vista.pulsarTecla(ee);
			break;
		case KeyEvent.VK_R:
			controlador_vista.pulsarTecla(r);
			break;
		case KeyEvent.VK_T:
			controlador_vista.pulsarTecla(t);
			break;
		case KeyEvent.VK_Y:
			controlador_vista.pulsarTecla(y);
			break;
		case KeyEvent.VK_U:
			controlador_vista.pulsarTecla(u);
			break;
		case KeyEvent.VK_I:
			controlador_vista.pulsarTecla(i);
			break;
		case KeyEvent.VK_O:
			controlador_vista.pulsarTecla(o);
			break;
		case KeyEvent.VK_P:
			controlador_vista.pulsarTecla(p);
			break;
		case KeyEvent.VK_DEAD_ACUTE:
			// simbolo '
			controlador_vista.pulsarTecla(simb_4);
			break;
		case KeyEvent.VK_PLUS:
			controlador_vista.pulsarTecla(simb_5);
			break;
		case KeyEvent.VK_ENTER:
			controlador_vista.pulsarTecla(t_enter);
			controlador_vista.pulsarTecla(t_enter2);
			break;
		case KeyEvent.VK_CAPS_LOCK:
			if(presionado==0)
				controlador_vista.pulsarTecla(t_bMayus);					
			break;
		case KeyEvent.VK_A:
			controlador_vista.pulsarTecla(a);
			break;
		case KeyEvent.VK_S:
			controlador_vista.pulsarTecla(s);
			break;
		case KeyEvent.VK_D:
			controlador_vista.pulsarTecla(d);
			break;
		case KeyEvent.VK_F:
			controlador_vista.pulsarTecla(f);
			break;
		case KeyEvent.VK_G:
			controlador_vista.pulsarTecla(g);
			break;
		case KeyEvent.VK_H:
			controlador_vista.pulsarTecla(h);
			break;
		case KeyEvent.VK_J:
			controlador_vista.pulsarTecla(j);
			break;
		case KeyEvent.VK_K:
			controlador_vista.pulsarTecla(k);
			break;
		case KeyEvent.VK_L:
			controlador_vista.pulsarTecla(l);
			break;
		case KeyEvent.VK_SHIFT:
			if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_LEFT) {
				controlador_vista.pulsarTecla(shift_i);
				break;
			} else if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_RIGHT) {
				controlador_vista.pulsarTecla(shift_d);
				break;
			}				
			break;
		case 153:
			controlador_vista.pulsarTecla(simb_8);
			break;
		case KeyEvent.VK_Z:
			controlador_vista.pulsarTecla(z);
			break;
		case KeyEvent.VK_X:
			controlador_vista.pulsarTecla(x);
			break;
		case KeyEvent.VK_C:
			controlador_vista.pulsarTecla(c);
			break;
		case KeyEvent.VK_V:
			controlador_vista.pulsarTecla(v);
			break;
		case KeyEvent.VK_B:
			controlador_vista.pulsarTecla(b);
			break;
		case KeyEvent.VK_N:
			controlador_vista.pulsarTecla(n);
			break;
		case KeyEvent.VK_M:
			controlador_vista.pulsarTecla(m);
			break;
		case KeyEvent.VK_COMMA:
			controlador_vista.pulsarTecla(simb_9);
			break;
		case KeyEvent.VK_PERIOD:
			controlador_vista.pulsarTecla(simb_10);
			break;
		case KeyEvent.VK_MINUS:
			controlador_vista.pulsarTecla(guion);
			break;
		case KeyEvent.VK_UP:
			controlador_vista.pulsarTecla(arriba);
			break;
		case KeyEvent.VK_CONTROL:
			if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_LEFT) {
				controlador_vista.pulsarTecla(ctrl1);
				break;
			} else if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_RIGHT) {
				controlador_vista.pulsarTecla(ctrl2);
				break;
			}				
			break;
		case KeyEvent.VK_WINDOWS:
			controlador_vista.pulsarTecla(win);
			break;
		case KeyEvent.VK_ALT:
			controlador_vista.pulsarTecla(alt);
			break;
		case KeyEvent.VK_SPACE:
			controlador_vista.pulsarTecla(spc);
			break;
		case KeyEvent.VK_ALT_GRAPH:
			controlador_vista.pulsarTecla(altgr);
			break;
		case KeyEvent.VK_CONTEXT_MENU:
			controlador_vista.pulsarTecla(menu);
			break;
		case KeyEvent.VK_LEFT:
			controlador_vista.pulsarTecla(izquierda);
			break;
		case KeyEvent.VK_DOWN:
			controlador_vista.pulsarTecla(abajo);
			break;
		case KeyEvent.VK_RIGHT:
			controlador_vista.pulsarTecla(derecha);
			break;
					
		default:
			break;
		}						
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int cod=e.getKeyCode();
		char caracter=e.getKeyChar();
		
		// switch de caracteres
		switch(caracter) {
		case '|':
			controlador_vista.soltarTecla(simb_1);
			break;
		case '¿':
			controlador_vista.soltarTecla(simb_3);
			break;
		case 'ñ':
			controlador_vista.soltarTecla(simb_enie);
			break;
		case '{':
			controlador_vista.soltarTecla(simb_6);
			break;
		case '}':
			controlador_vista.soltarTecla(simb_7);
			break;
		default:
			break;			
		}
		
		
		// switch de CODIGO
		switch (cod) {
		case KeyEvent.VK_ESCAPE:
			controlador_vista.soltarTecla(esc);
			break;
		case KeyEvent.VK_F1:
			controlador_vista.soltarTecla(f1);
			break;
		case KeyEvent.VK_F2:
			controlador_vista.soltarTecla(f2);
			break;
		case KeyEvent.VK_F3:
			controlador_vista.soltarTecla(f3);
			break;
		case KeyEvent.VK_F4:
			controlador_vista.soltarTecla(f4);
			break;
		case KeyEvent.VK_F5:
			controlador_vista.soltarTecla(f5);
			break;
		case KeyEvent.VK_F6:
			controlador_vista.soltarTecla(f6);
			break;
		case KeyEvent.VK_F7:
			controlador_vista.soltarTecla(f7);
			break;
		case KeyEvent.VK_F8:
			controlador_vista.soltarTecla(f8);
			break;
		case KeyEvent.VK_F9:
			controlador_vista.soltarTecla(f9);
			break;
		case KeyEvent.VK_F10:
			controlador_vista.soltarTecla(f10);
			break;
		case KeyEvent.VK_F11:
			controlador_vista.soltarTecla(f11);
			break;
		case KeyEvent.VK_F12:
			controlador_vista.soltarTecla(f12);
			break;
		case KeyEvent.VK_PAUSE:
			controlador_vista.soltarTecla(t_pause);
			break;
		case KeyEvent.VK_PRINTSCREEN:
			controlador_vista.soltarTecla(t_imp);
			break;
		case KeyEvent.VK_INSERT:
			controlador_vista.soltarTecla(t_ins);
			break;
		case KeyEvent.VK_DELETE:
			controlador_vista.soltarTecla(t_sup);
			break;
		case KeyEvent.VK_1:
			controlador_vista.soltarTecla(num1);
			break;
		case KeyEvent.VK_2:
			controlador_vista.soltarTecla(num2);
			break;
		case KeyEvent.VK_3:
			controlador_vista.soltarTecla(num3);
			break;
		case KeyEvent.VK_4:
			controlador_vista.soltarTecla(num4);
			break;
		case KeyEvent.VK_5:
			controlador_vista.soltarTecla(num5);
			break;
		case KeyEvent.VK_6:
			controlador_vista.soltarTecla(num6);
			break;
		case KeyEvent.VK_7:
			controlador_vista.soltarTecla(num7);
			break;
		case KeyEvent.VK_8:
			controlador_vista.soltarTecla(num8);
			break;
		case KeyEvent.VK_9:
			controlador_vista.soltarTecla(num9);
			break;
		case KeyEvent.VK_0:
			controlador_vista.soltarTecla(num0);
			break;
		case KeyEvent.VK_QUOTE:
			controlador_vista.soltarTecla(simb_2);
			break;
		case KeyEvent.VK_BACK_SPACE:
			controlador_vista.soltarTecla(backspc);
			break;
		case KeyEvent.VK_TAB:
			controlador_vista.soltarTecla(tabu);
			break;
		case KeyEvent.VK_Q:
			controlador_vista.soltarTecla(q);
			break;
		case KeyEvent.VK_W:
			controlador_vista.soltarTecla(w);
			break;
		case KeyEvent.VK_E:
			controlador_vista.soltarTecla(ee);
			break;
		case KeyEvent.VK_R:
			controlador_vista.soltarTecla(r);
			break;
		case KeyEvent.VK_T:
			controlador_vista.soltarTecla(t);
			break;
		case KeyEvent.VK_Y:
			controlador_vista.soltarTecla(y);
			break;
		case KeyEvent.VK_U:
			controlador_vista.soltarTecla(u);
			break;
		case KeyEvent.VK_I:
			controlador_vista.soltarTecla(i);
			break;
		case KeyEvent.VK_O:
			controlador_vista.soltarTecla(o);
			break;
		case KeyEvent.VK_P:
			controlador_vista.soltarTecla(p);
			break;
		case KeyEvent.VK_DEAD_ACUTE:
			// simbolo '
			controlador_vista.soltarTecla(simb_4);
			break;
		case KeyEvent.VK_PLUS:
			controlador_vista.soltarTecla(simb_5);
			break;
		case KeyEvent.VK_ENTER:
			controlador_vista.soltarTecla(t_enter);
			controlador_vista.soltarTecla(t_enter2);
			break;
		case KeyEvent.VK_CAPS_LOCK:
			if(presionado==0) {
				presionado=1;
			} else {
				controlador_vista.soltarTecla(t_bMayus);
				presionado=0;
			}
			break;
		case KeyEvent.VK_A:
			controlador_vista.soltarTecla(a);
			break;
		case KeyEvent.VK_S:
			controlador_vista.soltarTecla(s);
			break;
		case KeyEvent.VK_D:
			controlador_vista.soltarTecla(d);
			break;
		case KeyEvent.VK_F:
			controlador_vista.soltarTecla(f);
			break;
		case KeyEvent.VK_G:
			controlador_vista.soltarTecla(g);
			break;
		case KeyEvent.VK_H:
			controlador_vista.soltarTecla(h);
			break;
		case KeyEvent.VK_J:
			controlador_vista.soltarTecla(j);
			break;
		case KeyEvent.VK_K:
			controlador_vista.soltarTecla(k);
			break;
		case KeyEvent.VK_L:
			controlador_vista.soltarTecla(l);
			break;
		case KeyEvent.VK_SHIFT:
			if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_LEFT) {
				controlador_vista.soltarTecla(shift_i);
				break;
			} else if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_RIGHT) {
				controlador_vista.soltarTecla(shift_d);
				break;
			}				
			break;
		case 153:
			controlador_vista.soltarTecla(simb_8);
			break;
		case KeyEvent.VK_Z:
			controlador_vista.soltarTecla(z);
			break;
		case KeyEvent.VK_X:
			controlador_vista.soltarTecla(x);
			break;
		case KeyEvent.VK_C:
			controlador_vista.soltarTecla(c);
			break;
		case KeyEvent.VK_V:
			controlador_vista.soltarTecla(v);
			break;
		case KeyEvent.VK_B:
			controlador_vista.soltarTecla(b);
			break;
		case KeyEvent.VK_N:
			controlador_vista.soltarTecla(n);
			break;
		case KeyEvent.VK_M:
			controlador_vista.soltarTecla(m);
			break;
		case KeyEvent.VK_COMMA:
			controlador_vista.soltarTecla(simb_9);
			break;
		case KeyEvent.VK_PERIOD:
			controlador_vista.soltarTecla(simb_10);
			break;
		case KeyEvent.VK_MINUS:
			controlador_vista.soltarTecla(guion);
			break;
		case KeyEvent.VK_UP:
			controlador_vista.soltarTecla(arriba);
			break;
		case KeyEvent.VK_CONTROL:
			if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_LEFT) {
				controlador_vista.soltarTecla(ctrl1);
				break;
			} else if(e.getKeyLocation()==KeyEvent.KEY_LOCATION_RIGHT) {
				controlador_vista.soltarTecla(ctrl2);
				break;
			}				
			break;
		case KeyEvent.VK_WINDOWS:
			controlador_vista.soltarTecla(win);
			break;
		case KeyEvent.VK_ALT:
			controlador_vista.soltarTecla(alt);
			break;
		case KeyEvent.VK_SPACE:
			controlador_vista.soltarTecla(spc);
			break;
		case KeyEvent.VK_ALT_GRAPH:
			controlador_vista.soltarTecla(altgr);
			break;
		case KeyEvent.VK_CONTEXT_MENU:
			controlador_vista.soltarTecla(menu);
			break;
		case KeyEvent.VK_LEFT:
			controlador_vista.soltarTecla(izquierda);
			break;
		case KeyEvent.VK_DOWN:
			controlador_vista.soltarTecla(abajo);
			break;
		case KeyEvent.VK_RIGHT:
			controlador_vista.soltarTecla(derecha);
			break;

		default:
			break;		
		}		
	}
	
	ActionListener oyentedeAccion = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			/* el boton no debe ser focuseable sino no funciona el keylistener */
			jb_mecano.setFocusable(false);
			/** mostramos el label donde se muestran las frases **/
			jl_mecano.setVisible(true);
			controlador_vista.MecanografiaActivo(jl_mecano);
		
			/*
			 * controlador, vamos a empezar a jugar
			 * seteame una frase
			 * empeza a borrar mientras voy tipeando
			 * 
			 * 
			 * 
			 * 
			 * */
			
		}
		
	};
	
	public void initialize() {
		this.setTitle("test-teclado");
		this.setSize(860, 420);
		this.setLocation(100, 100);
		this.setResizable(true);
		this.setFocusable(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		/* para cambiar el color de la ventana en gral*/
		/* Mejor opcion es poner todo dentro de otro componente */
		getContentPane().setBackground(FondoForm);
		/*clave para capturar tecla tab y tecla ´ (acento agudo) */
		this.setFocusTraversalKeysEnabled(false);

		this.addKeyListener(this);
		
		/*** primera fila de teclas ***/
		esc = new Tecla("Esc",10,10,40,40,KeyEvent.VK_ESCAPE);
		f1 = new Tecla("f1",60, 10, 40, 40,KeyEvent.VK_F1);
		f2 = new Tecla("f2",110, 10, 40, 40,KeyEvent.VK_F2);
		f3 = new Tecla("f3",160, 10, 40, 40,KeyEvent.VK_F3);
		f4 = new Tecla("f4",210, 10, 40, 40,KeyEvent.VK_F4);
		f5 = new Tecla("f5",260, 10, 40, 40,KeyEvent.VK_F5);
		f6 = new Tecla("f6",310, 10, 40, 40,KeyEvent.VK_F6);
		f7 = new Tecla("f7",360, 10, 40, 40,KeyEvent.VK_F7);
		f8 = new Tecla("f8",410, 10, 40, 40,KeyEvent.VK_F8);
		f9 = new Tecla("f9",460, 10, 40, 40,KeyEvent.VK_F9);
		f10 = new Tecla("f10",510, 10, 40, 40,KeyEvent.VK_F10);
		f11 = new Tecla("f11",560, 10, 40, 40,KeyEvent.VK_F11);
		f12= new Tecla("f12",610, 10, 40, 40,KeyEvent.VK_F12);
		t_pause = new Tecla("pause",660, 10, 40, 40,KeyEvent.VK_PAUSE);
		t_imp = new Tecla("imp",710, 10, 40, 40,KeyEvent.VK_PRINTSCREEN);
		t_ins = new Tecla("ins",760, 10, 40, 40,KeyEvent.VK_INSERT);
		t_sup = new Tecla("supr",810, 10, 40, 40,KeyEvent.VK_DELETE);
		
		/*** Segunda fila de teclas ***/
		// simb_1 = new Tecla("Â°",10, 100, 40, 40,Integer.parseInt("|"));
		simb_1 = new Tecla("°", 10, 100, 50, 40,3423);
		num1 = new Tecla("1", 65, 100, 50, 40,KeyEvent.VK_1);
		num2 = new Tecla("2", 120, 100, 50, 40,KeyEvent.VK_2);
		num3 = new Tecla("3", 175, 100, 50, 40,KeyEvent.VK_3);
		num4 = new Tecla("4", 230, 100, 50, 40,KeyEvent.VK_4);
		num5 = new Tecla("5", 285, 100, 50, 40,KeyEvent.VK_5);
		num6 = new Tecla("6", 340, 100, 50, 40,KeyEvent.VK_6);
		num7 = new Tecla("7", 395, 100, 50, 40,KeyEvent.VK_7);
		num8 = new Tecla("8", 450, 100, 50, 40,KeyEvent.VK_8);
		num9 = new Tecla("9", 505, 100, 50, 40,KeyEvent.VK_9);
		num0 = new Tecla("0", 560, 100, 50, 40,KeyEvent.VK_0);
		simb_2 = new Tecla("?", 615, 100, 50, 40,KeyEvent.VK_QUOTE);
		// simb_3 = new Tecla("Â¡",610, 100, 40, 40,Integer.parseInt("Â¿"));
		simb_3 = new Tecla("¿", 670, 100, 50, 40,3333);		
		/* diseño telca Backspace */
		backspc = new Tecla("backspace",725, 100, 125, 40,KeyEvent.VK_BACK_SPACE);
		
		/*** Tercera fila de teclas ***/
		tabu = new Tecla("tab",10, 150, 75, 50,KeyEvent.VK_TAB);
		q = new Tecla("q",90, 150, 50, 50,KeyEvent.VK_Q);
		w = new Tecla("w",145, 150, 50, 50,KeyEvent.VK_W);
		ee = new Tecla("e",200, 150, 50, 50,KeyEvent.VK_E);
		r = new Tecla("r",255, 150, 50, 50,KeyEvent.VK_R);
		t = new Tecla("t",310, 150, 50, 50,KeyEvent.VK_T);
		y = new Tecla("y",365, 150, 50, 50,KeyEvent.VK_Y);
		u = new Tecla("u",420, 150, 50, 50,KeyEvent.VK_U);
		i = new Tecla("i",475, 150, 50, 50,KeyEvent.VK_I);
		o = new Tecla("o",530, 150, 50, 50,KeyEvent.VK_O);
		p = new Tecla("p",585, 150, 50, 50,KeyEvent.VK_P);
		simb_4 = new Tecla("'",640, 150, 50, 50,KeyEvent.VK_DEAD_ACUTE);
		simb_5 = new Tecla("+",695, 150, 50, 50,KeyEvent.VK_PLUS);
		t_enter = new Tecla("enter",750, 150, 100, 50,KeyEvent.VK_ENTER);
		/* Diseño tecla Enter parte 1 */
		t_enter.setBorder(new MatteBorder(1,1,0,1, Color.LIGHT_GRAY));
		t_enter.setBorde_press(new MatteBorder(1,1,0,1, Color.LIGHT_GRAY));
		t_enter.setBorde_relea(new MatteBorder(1,1,0,1, Color.LIGHT_GRAY));
		
		/*** Cuarta fila de teclas ***/
		t_bMayus = new Tecla("Bloq May",10, 210, 100, 50,KeyEvent.VK_CAPS_LOCK);
		a = new Tecla("a",115, 210, 50, 50,KeyEvent.VK_A);
		s = new Tecla("s",170, 210, 50, 50,KeyEvent.VK_S);
		d = new Tecla("d",225, 210, 50, 50,KeyEvent.VK_D);
		f = new Tecla("f",280, 210, 50, 50,KeyEvent.VK_F);
		g = new Tecla("g",335, 210, 50, 50,KeyEvent.VK_G);
		h = new Tecla("h",390, 210, 50, 50,KeyEvent.VK_H);
		j = new Tecla("j",445, 210, 50, 50,KeyEvent.VK_J);
		k = new Tecla("k",500, 210, 50, 50,KeyEvent.VK_K);
		l = new Tecla("l",555, 210, 50, 50,KeyEvent.VK_L);
		simb_enie = new Tecla("ñ",610, 210, 50, 50,999);
		simb_6 = new Tecla("{",665, 210, 50, 50,161);
		simb_7 = new Tecla("}",720, 210, 50, 50,162);
		/* Diseño tecla Enter parte 2 */
		t_enter2 = new Tecla("", 775, 199, 75, 61, KeyEvent.VK_ENTER);
		t_enter2.setBorde_press(new MatteBorder(0,1,0,1, Color.LIGHT_GRAY));
		t_enter2.setBorde_relea(new MatteBorder(0,1,0,1, Color.LIGHT_GRAY));
		t_enter2.setBorder(new MatteBorder(0,1,1,1, Color.LIGHT_GRAY));
		
		/*** Quinta fila de teclas ***/
		shift_i = new Tecla("shift",10, 270, 70, 50,KeyEvent.VK_SHIFT);
		simb_8 = new Tecla("<",85, 270, 50, 50,153);
		z = new Tecla("z",140, 270, 50, 50,KeyEvent.VK_Z);
		x = new Tecla("x",195, 270, 50, 50,KeyEvent.VK_X);
		c = new Tecla("c",250, 270, 50, 50,KeyEvent.VK_C);
		v = new Tecla("v",305, 270, 50, 50,KeyEvent.VK_V);
		b = new Tecla("b",360, 270, 50, 50,KeyEvent.VK_B);
		n = new Tecla("n",415, 270, 50, 50,KeyEvent.VK_N);
		m = new Tecla("m",470, 270, 50, 50,KeyEvent.VK_M);
		simb_9 = new Tecla(",",525, 270, 50, 50,KeyEvent.VK_COMMA);
		simb_10 = new Tecla(".",580, 270, 50, 50,KeyEvent.VK_PERIOD);
		guion = new Tecla("-",635, 270, 50, 50,KeyEvent.VK_MINUS);
		shift_d = new Tecla("shift",690, 270, 50, 50,KeyEvent.VK_SHIFT);
		arriba = new Tecla("arr",745, 270, 50, 50,KeyEvent.VK_UP);
		
		/*** Sexta fila de teclas ***/
		ctrl1 = new Tecla("Ctrl",10, 330, 50, 50,KeyEvent.VK_CONTROL);
		fn = new Tecla("fn",65, 330, 50, 50,666);
		win = new Tecla("win",120, 330, 50, 50,KeyEvent.VK_WINDOWS);
		alt = new Tecla("Alt",175, 330, 50, 50,KeyEvent.VK_ALT);
		spc = new Tecla("space",230, 330, 290, 50,KeyEvent.VK_SPACE);
		altgr = new Tecla("Alt Gr",525, 330, 50, 50,65406);
		menu = new Tecla("menu",580, 330, 50, 50,KeyEvent.VK_CONTEXT_MENU);
		ctrl2 = new Tecla("Ctrl",635, 330, 50, 50,KeyEvent.VK_CONTROL);
		izquierda = new Tecla("izq",690, 330, 50, 50,KeyEvent.VK_LEFT);
		abajo = new Tecla("aba",745, 330, 50, 50,KeyEvent.VK_DOWN);
		derecha = new Tecla("der",800, 330, 50, 50,KeyEvent.VK_RIGHT);
		
		/* label mecanografia*/
		jl_mecano = new Mecanografia();
		jl_mecano.setBorder(new MatteBorder(2,0,2,0, new Color(5, 101, 158)));
		jl_mecano.setFont(new Font("Verdana", 3, 24));
		jl_mecano.setBounds(120, 55, 600, 40);
		jl_mecano.setVisible(false);
		
		/* boton mecanografia */
		jb_mecano = new JButton("");
		jb_mecano.setBounds(800, 270, 50, 50);
		jb_mecano.setBorder(new BordeRedondo(30));
		jb_mecano.addActionListener(oyentedeAccion);
				
		 getContentPane().add(esc);
		 getContentPane().add(f1);
		 getContentPane().add(f2);
		 getContentPane().add(f3);
		 getContentPane().add(f4);
		 getContentPane().add(f5);
		 getContentPane().add(f6);
		 getContentPane().add(f7);
		 getContentPane().add(f8);
		 getContentPane().add(f9);
		 getContentPane().add(f10);
		 getContentPane().add(f11);
		 getContentPane().add(f12);
		 getContentPane().add(t_pause);
		 getContentPane().add(t_imp);
		 getContentPane().add(t_ins);
		 getContentPane().add(t_sup);
		 getContentPane().add(simb_1);
		 getContentPane().add(num1);
		 getContentPane().add(num2);
		 getContentPane().add(num3);
		 getContentPane().add(num4);
		 getContentPane().add(num5);
		 getContentPane().add(num6);
		 getContentPane().add(num7);
		 getContentPane().add(num8);
		 getContentPane().add(num9);
		 getContentPane().add(num0);
		 getContentPane().add(simb_2);
		 getContentPane().add(simb_3);
		 getContentPane().add(backspc);
		 getContentPane().add(tabu);
		 getContentPane().add(q);
		 getContentPane().add(w);
		 getContentPane().add(ee);
		 getContentPane().add(r);
		 getContentPane().add(t);
		 getContentPane().add(y);
		 getContentPane().add(u);
		 getContentPane().add(i);
		 getContentPane().add(o);
		 getContentPane().add(p);
		 getContentPane().add(simb_4);
		 getContentPane().add(simb_5);
		 getContentPane().add(t_enter);
		 getContentPane().add(t_bMayus);
		 getContentPane().add(a);
		 getContentPane().add(s);
		 getContentPane().add(d);
		 getContentPane().add(f);
		 getContentPane().add(g);
		 getContentPane().add(h);
		 getContentPane().add(j);
		 getContentPane().add(k);
		 getContentPane().add(l);
		 getContentPane().add(simb_enie);
		 getContentPane().add(simb_6);
		 getContentPane().add(simb_7);
		 getContentPane().add(t_enter2);
		 getContentPane().add(shift_i);			
		 getContentPane().add(simb_8);
		 getContentPane().add(z);
		 getContentPane().add(x);
		 getContentPane().add(c);
		 getContentPane().add(v);
		 getContentPane().add(b);
		 getContentPane().add(n);
		 getContentPane().add(m);
		 getContentPane().add(simb_9);
		 getContentPane().add(simb_10);
		 getContentPane().add(guion);
		 getContentPane().add(shift_d);
		 getContentPane().add(arriba);
		 getContentPane().add(ctrl1);
		 getContentPane().add(fn);
		 getContentPane().add(win);
		 getContentPane().add(alt);
		 getContentPane().add(spc);
		 getContentPane().add(altgr);
		 getContentPane().add(menu);
		 getContentPane().add(ctrl2);
		 getContentPane().add(izquierda);
		 getContentPane().add(abajo);
		 getContentPane().add(derecha);
		 getContentPane().add(jl_mecano);
		 getContentPane().add(jb_mecano);
		
	}
}