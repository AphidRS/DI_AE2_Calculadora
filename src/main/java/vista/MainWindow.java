package vista;

import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;

import controlador.Events;
import controlador.Main;

public class MainWindow extends JFrame{
	
		private JButton boton_1;
		private JButton boton_2;
		private JButton boton_3;
		private JButton boton_4;
		private JButton boton_5;
		private JButton boton_6;
		private JButton boton_7;
		private JButton boton_8;
		private JButton boton_9;
		private JButton boton_0;
		private JButton boton_coma;
		private JButton boton_porcentaje;
		private JButton boton_mas;
		private JButton boton_menos;
		private JButton boton_multiplicar;
		private JButton boton_dividir;
		private JButton boton_reset;
		private JButton boton_potencia;
		private JButton boton_resultado;
		private JTextField cuadro_entrada;		
		private JTextArea cuadro_resultado;
		ArrayList<String> resultados = new ArrayList<>();
		String[] operandos = {"","",""};



		
		public MainWindow()	{
			
			setLocationRelativeTo(null);
			setBounds(450, 300, 380, 550);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			setTitle("Calculadora");
			setLayout(null);
			setFont(new Font("Arial",Font.PLAIN ,75));
			setBackground(Color.DARK_GRAY);
			inicializarComponentes();
			setVisible(true);

		}
		
		public void inicializarComponentes() {
			
			boton_1 = new JButton("1");
			boton_1.setBounds(20,380,60,50);
			boton_1.setFont(new Font("Arial",Font.BOLD ,20));
			boton_1.setBackground(Color.lightGray);
			add(boton_1);

			boton_2 = new JButton("2");
			boton_2.setBounds(85,380,60,50);
			boton_2.setFont(new Font("Arial",Font.BOLD ,20));
			boton_2.setBackground(Color.lightGray);
			add(boton_2);

			boton_3 = new JButton("3");
			boton_3.setBounds(150,380,60,50);
			boton_3.setFont(new Font("Arial",Font.BOLD ,20));
			boton_3.setBackground(Color.lightGray);
			add(boton_3);

			boton_4 = new JButton("4");
			boton_4.setBounds(20,325,60,50);
			boton_4.setFont(new Font("Arial",Font.BOLD ,20));
			boton_4.setBackground(Color.lightGray);
			add(boton_4);

			boton_5 = new JButton("5");
			boton_5.setBounds(85,325,60,50);
			boton_5.setFont(new Font("Arial",Font.BOLD ,20));
			boton_5.setBackground(Color.lightGray);
			add(boton_5);

			boton_6 = new JButton("6");
			boton_6.setBounds(150,325,60,50);
			boton_6.setFont(new Font("Arial",Font.BOLD ,20));
			boton_6.setBackground(Color.lightGray);
			add(boton_6);

			boton_7 = new JButton("7");
			boton_7.setBounds(20,270,60,50);
			boton_7.setFont(new Font("Arial",Font.BOLD ,20));
			boton_7.setBackground(Color.lightGray);
			add(boton_7);

			boton_8 = new JButton("8");
			boton_8.setBounds(85,270,60,50);
			boton_8.setFont(new Font("Arial",Font.BOLD ,20));
			boton_8.setBackground(Color.lightGray);
			add(boton_8);

			boton_9 = new JButton("9");
			boton_9.setBounds(150,270,60,50);
			boton_9.setFont(new Font("Arial",Font.BOLD ,20));
			boton_9.setBackground(Color.lightGray);
			add(boton_9);

			boton_0 = new JButton("0");
			boton_0.setBounds(20,435,60,50);
			boton_0.setFont(new Font("Arial",Font.BOLD ,20));
			boton_0.setBackground(Color.lightGray);
			add(boton_0);
			
			boton_coma = new JButton(",");
			boton_coma.setBounds(85,435,60,50);
			boton_coma.setFont(new Font("Arial",Font.BOLD ,20));
			boton_coma.setBackground(Color.lightGray);
			add(boton_coma);
			
			boton_porcentaje = new JButton("%");
			boton_porcentaje.setBounds(150,435,60,50);
			boton_porcentaje.setFont(new Font("Arial",Font.BOLD ,20));
			boton_porcentaje.setBackground(Color.lightGray);
			add(boton_porcentaje);
			
			//
			boton_dividir = new JButton("/");
			boton_dividir.setBounds(215,270,60,50);
			boton_dividir.setFont(new Font("Arial",Font.BOLD ,20));
			boton_dividir.setBackground(Color.lightGray);
			add(boton_dividir);
			
			boton_multiplicar = new JButton("*");
			boton_multiplicar.setBounds(215,325,60,50);
			boton_multiplicar.setFont(new Font("Arial",Font.BOLD ,20));
			boton_multiplicar.setBackground(Color.lightGray);
			add(boton_multiplicar);
			
			boton_menos = new JButton("-");
			boton_menos.setBounds(215,380,60,50);
			boton_menos.setFont(new Font("Arial",Font.BOLD ,20));
			boton_menos.setBackground(Color.lightGray);
			add(boton_menos);
			
			boton_mas = new JButton("+");
			boton_mas.setBounds(215,435,60,50);
			boton_mas.setFont(new Font("Arial",Font.BOLD ,20));
			boton_mas.setBackground(Color.lightGray);
			add(boton_mas);
			
			// 
			
			boton_reset = new JButton("CE");
			boton_reset.setBounds(280,270,60,50);
			boton_reset.setFont(new Font("Arial",Font.BOLD ,18));
			boton_reset.setBackground(Color.lightGray);
			add(boton_reset);

			boton_potencia = new JButton("ª");
			boton_potencia.setBounds(280,325,60,50);
			boton_potencia.setFont(new Font("Arial",Font.BOLD ,20));
			boton_potencia.setBackground(Color.lightGray);
			add(boton_potencia);

			boton_resultado = new JButton("=");
			boton_resultado.setBounds(280,380,60,105);
			boton_resultado.setFont(new Font("Arial",Font.BOLD ,20));
			boton_resultado.setBackground(Color.lightGray);
			add(boton_resultado);

			cuadro_entrada = new JTextField();
			cuadro_entrada.setBounds(20,210,320,50);
			cuadro_entrada.setBackground(new Color(220,220,220));
			cuadro_entrada.setFont(new Font("Arial",Font.BOLD ,24));
			add(cuadro_entrada);

			cuadro_resultado = new JTextArea();
			cuadro_resultado.setBounds(20, 20, 320, 180);
			cuadro_resultado.setFont(new Font("Arial",Font.BOLD ,24));
			cuadro_resultado.setEditable(false);


			JScrollPane scroll = new JScrollPane(cuadro_resultado);
			scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			add(scroll);
			add(cuadro_resultado);

		}

	public JButton getBoton_0() {
		return boton_0;
	}

	public JButton getBoton_1() {
		return boton_1;
	}

	public JButton getBoton_2() {
		return boton_2;
	}

	public JButton getBoton_3() {
		return boton_3;
	}

	public JButton getBoton_4() {
		return boton_4;
	}

	public JButton getBoton_5() {
		return boton_5;
	}

	public JButton getBoton_6() {
		return boton_6;
	}

	public JButton getBoton_7() {
		return boton_7;
	}

	public JButton getBoton_8() {
		return boton_8;
	}

	public JButton getBoton_9() {
		return boton_9;
	}

	public JButton getBoton_coma() {
		return boton_coma;
	}

	public JButton getBoton_porcentaje() {
		return boton_porcentaje;
	}

	public JButton getBoton_mas() {
		return boton_mas;
	}

	public JButton getBoton_menos() {
		return boton_menos;
	}

	public JButton getBoton_multiplicar() {
		return boton_multiplicar;
	}

	public JButton getBoton_dividir() {
		return boton_dividir;
	}

	public JButton getBoton_reset() {
		return boton_reset;
	}

	public JButton getBoton_potencia() {
		return boton_potencia;
	}

	public JButton getBoton_resultado() {
		return boton_resultado;
	}
	

		public void setHandler(Events eventhandler) {

			boton_0.addActionListener(eventhandler);
			boton_1.addActionListener(eventhandler);
			boton_2.addActionListener(eventhandler);
			boton_3.addActionListener(eventhandler);
			boton_4.addActionListener(eventhandler);
			boton_5.addActionListener(eventhandler);
			boton_6.addActionListener(eventhandler);
			boton_7.addActionListener(eventhandler);
			boton_8.addActionListener(eventhandler);
			boton_9.addActionListener(eventhandler);
			boton_coma.addActionListener(eventhandler);
			boton_porcentaje.addActionListener(eventhandler);
			boton_dividir.addActionListener(eventhandler);
			boton_multiplicar.addActionListener(eventhandler);
			boton_menos.addActionListener(eventhandler);
			boton_mas.addActionListener(eventhandler);
			boton_reset.addActionListener(eventhandler);
			boton_potencia.addActionListener(eventhandler);
			boton_resultado.addActionListener(eventhandler);
		}
		
		public String[] getCuadro_entrada() {
			return operandos;
		}

		public void setCuadro_entrada() {
			cuadro_entrada.setText(operandos[0] + operandos[1] + operandos[2]);
		}

		public String getCuadro_resultado() {
			return cuadro_resultado.getText();
		}

		public void setCuadro_resultado(String s) {
			resultados.add(s+"\n");
			this.cuadro_resultado.setText(listarResultados(resultados));
		}

		public void campoActivo(String s){
			if (operandos[1].equals("")) {
				operandos[0] = operandos[0] + s;
				if (operandos[0].contains(".")) {
					boton_coma.setEnabled(false);
				}else {
					boton_coma.setEnabled(true);
				}
					
			} else {
				operandos[2] = operandos[2] + s;
				if (operandos[2].contains(".")) {
					boton_coma.setEnabled(false);
				}else {
					boton_coma.setEnabled(true);
				}
					
			}
			setCuadro_entrada();
		}

		public void calcular(){

			switch (operandos[1]) {

				case "+":
					double resultado = Double.parseDouble(operandos[0]) + Double.parseDouble(operandos[2]);
					setCuadro_resultado(String.valueOf(operandos[0]) + String.valueOf(operandos[1]) + String.valueOf(operandos[2]) + " = " + String.valueOf(resultado));
					break;
				case "-":
					resultado = Double.parseDouble(operandos[0])-Double.parseDouble(operandos[2]);
					setCuadro_resultado(String.valueOf(operandos[0])+String.valueOf(operandos[1])+String.valueOf(operandos[2])+" = "+ String.valueOf(resultado));
					break;
				case "*":
					resultado = Double.parseDouble(operandos[0])*Double.parseDouble(operandos[2]);
					setCuadro_resultado(String.valueOf(operandos[0])+String.valueOf(operandos[1])+String.valueOf(operandos[2])+" = "+ String.valueOf(resultado));
					break;
				case "/":
					try{
						resultado = Double.parseDouble(operandos[0])/Double.parseDouble(operandos[2]);					
						setCuadro_resultado(String.valueOf(operandos[0])+String.valueOf(operandos[1])+String.valueOf(operandos[2])+" = "+ String.valueOf(resultado));
					}
					catch (Exception e){
						setCuadro_resultado("El divisor debe ser " + "\ndistinto de cero");
					}
					break;
			}
			resetEntrada();
		}

		public void resetEntrada() {
			operandos[0] = "";
			operandos[1] = "";
			operandos[2] = "";
			setCuadro_entrada();

		}

		public void suma(){
			operandos[1] = "+";
		}

		public void resta(){
			operandos[1] = "-";
		}

		public void dividir(){
			operandos[1] = "/";
		}

		public void multiplicar(){
			operandos[1] = "*";
		}

		public String listarResultados(ArrayList resultados) {
			String resultados_string = "";
			for (int i=0; i< resultados.size();i++) {
				resultados_string = resultados_string + resultados.get(i);
			}
			return resultados_string;
		}
}

