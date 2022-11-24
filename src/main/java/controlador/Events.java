package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.MainWindow;

public class Events implements ActionListener{
	
	private MainWindow ventana;
	
	public Events(MainWindow ventana) { 
		this.ventana = ventana;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ventana.getBoton_0()) {
			ventana.campoActivo("0");
			ventana.getBoton_0();
		}
			
		if (e.getSource() == ventana.getBoton_1()) {
			ventana.campoActivo("1");
			ventana.getBoton_1();
		}
			
			
		if (e.getSource() == ventana.getBoton_2()) {
			ventana.campoActivo("2");
			ventana.getBoton_2();

		}
		
		if (e.getSource() == ventana.getBoton_3()) {
			ventana.campoActivo("3");
			ventana.getBoton_3();

		}
					
		if (e.getSource() == ventana.getBoton_4()) {
			ventana.campoActivo("4");
			ventana.getBoton_4();

		}
							
		if (e.getSource() == ventana.getBoton_5()) {
			ventana.campoActivo("5");
			ventana.getBoton_5();

		}
					
		if (e.getSource() == ventana.getBoton_6()) {
			ventana.campoActivo("6");
			ventana.getBoton_6();

		}
					
		if (e.getSource() == ventana.getBoton_7()) {
			ventana.campoActivo("7");
			ventana.getBoton_7();
		}
							
		if (e.getSource() == ventana.getBoton_8()) {
			ventana.campoActivo("8");
			ventana.getBoton_8();
		}
							
		if (e.getSource() == ventana.getBoton_9()) {
			ventana.campoActivo("9");
			ventana.getBoton_9();
		}
			
		if (e.getSource() == ventana.getBoton_resultado()) {
			ventana.calcular();
		}

		if (e.getSource() == ventana.getBoton_mas()) {
			ventana.suma();
		}

		if (e.getSource() == ventana.getBoton_menos()) {
			ventana.resta();
		}

		if (e.getSource() == ventana.getBoton_multiplicar()) {
			ventana.multiplicar();
		}

		if (e.getSource() == ventana.getBoton_dividir()) {
			ventana.dividir();
		}
		if (e.getSource() == ventana.getBoton_reset()) {
			ventana.resetEntrada();
		}
		if (e.getSource() == ventana.getBoton_coma()) {
			ventana.campoActivo(".");
			ventana.getBoton_coma();
		}
		if (e.getSource() == ventana.getBoton_raizCubica()) {
			ventana.raizCubica();
		}
		if (e.getSource() == ventana.getBoton_raizCuadrada()) {
			ventana.raizCuadrada();
		}
		if (e.getSource() == ventana.getBoton_signo()) {
			ventana.campoActivo("-");
			ventana.getBoton_signo();
		}
	
	}

}
