package vista;

import java.awt.*;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import controlador.Events;

public class MainWindow extends JFrame {

	@Serial
	private static final long serialVersionUID = 1L;
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
	private JButton boton_signo;
	private JButton boton_resultado;
	private JButton boton_raizCuadrada;
	private JButton boton_raizCubica;
	private JTextField cuadro_entrada;
	private JTextArea cuadro_resultado;
	private JScrollPane scroll;
	List<String> resultados = new ArrayList<>();
	String[] operandos = { "", "", "" };

	public MainWindow() {

		setLocationRelativeTo(null);
		setBounds(450, 300, 360, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Calculadora");
		setLayout(null);
		setFont(new Font("Consolas", Font.PLAIN, 75));
		inicializarComponentes();
		setVisible(true);

	}

	public void inicializarComponentes() {

		boton_1 = new JButton("1");
		boton_1.setBounds(20, 380, 60, 50);
		boton_1.setFont(new Font("Arial", Font.BOLD, 20));
		boton_1.setBackground(Color.lightGray);
		add(boton_1);

		boton_2 = new JButton("2");
		boton_2.setBounds(85, 380, 60, 50);
		boton_2.setFont(new Font("Arial", Font.BOLD, 20));
		boton_2.setBackground(Color.lightGray);
		add(boton_2);

		boton_3 = new JButton("3");
		boton_3.setBounds(150, 380, 60, 50);
		boton_3.setFont(new Font("Arial", Font.BOLD, 20));
		boton_3.setBackground(Color.lightGray);
		add(boton_3);

		boton_4 = new JButton("4");
		boton_4.setBounds(20, 325, 60, 50);
		boton_4.setFont(new Font("Arial", Font.BOLD, 20));
		boton_4.setBackground(Color.lightGray);
		add(boton_4);

		boton_5 = new JButton("5");
		boton_5.setBounds(85, 325, 60, 50);
		boton_5.setFont(new Font("Arial", Font.BOLD, 20));
		boton_5.setBackground(Color.lightGray);
		add(boton_5);

		boton_6 = new JButton("6");
		boton_6.setBounds(150, 325, 60, 50);
		boton_6.setFont(new Font("Arial", Font.BOLD, 20));
		boton_6.setBackground(Color.lightGray);
		add(boton_6);

		boton_7 = new JButton("7");
		boton_7.setBounds(20, 270, 60, 50);
		boton_7.setFont(new Font("Arial", Font.BOLD, 20));
		boton_7.setBackground(Color.lightGray);
		add(boton_7);

		boton_8 = new JButton("8");
		boton_8.setBounds(85, 270, 60, 50);
		boton_8.setFont(new Font("Arial", Font.BOLD, 20));
		boton_8.setBackground(Color.lightGray);
		add(boton_8);

		boton_9 = new JButton("9");
		boton_9.setBounds(150, 270, 60, 50);
		boton_9.setFont(new Font("Arial", Font.BOLD, 20));
		boton_9.setBackground(Color.lightGray);
		add(boton_9);

		boton_0 = new JButton("0");
		boton_0.setBounds(20, 435, 60, 50);
		boton_0.setFont(new Font("Arial", Font.BOLD, 20));
		boton_0.setBackground(Color.lightGray);
		add(boton_0);

		boton_coma = new JButton(",");
		boton_coma.setBounds(85, 435, 60, 50);
		boton_coma.setFont(new Font("Arial", Font.BOLD, 20));
		boton_coma.setBackground(new Color(205, 205, 205));
		add(boton_coma);

		boton_porcentaje = new JButton("%");
		boton_porcentaje.setBounds(150, 435, 60, 50);
		boton_porcentaje.setFont(new Font("Arial", Font.BOLD, 20));
		boton_porcentaje.setBackground(new Color(205, 205, 205));
		add(boton_porcentaje);

		//
		boton_dividir = new JButton("/");
		boton_dividir.setBounds(215, 270, 60, 50);
		boton_dividir.setFont(new Font("Arial", Font.BOLD, 20));
		boton_dividir.setBackground(new Color(245, 125, 75));
		add(boton_dividir);

		boton_multiplicar = new JButton("*");
		boton_multiplicar.setBounds(215, 325, 60, 50);
		boton_multiplicar.setFont(new Font("Arial", Font.BOLD, 20));
		boton_multiplicar.setBackground(new Color(245, 125, 75));
		add(boton_multiplicar);

		boton_menos = new JButton("-");
		boton_menos.setBounds(215, 380, 60, 50);
		boton_menos.setFont(new Font("Arial", Font.BOLD, 20));
		boton_menos.setBackground(new Color(245, 125, 75));
		add(boton_menos);

		boton_mas = new JButton("+");
		boton_mas.setBounds(215, 435, 60, 50);
		boton_mas.setFont(new Font("Arial", Font.BOLD, 20));
		boton_mas.setBackground(new Color(245, 125, 75));
		add(boton_mas);

		//

		boton_reset = new JButton("CE");
		boton_reset.setBounds(280, 270, 60, 50);
		boton_reset.setFont(new Font("Arial", Font.BOLD, 18));
		boton_reset.setBackground(new Color(255,75,100));
		add(boton_reset);

		boton_signo = new JButton("+/-");
		boton_signo.setBounds(280, 325, 60, 50);
		boton_signo.setFont(new Font("Arial", Font.BOLD, 20));
		boton_signo.setBackground(new Color(245, 125, 75));
		add(boton_signo);

		boton_resultado = new JButton("=");
		boton_resultado.setBounds(280, 380, 60, 160);
		boton_resultado.setFont(new Font("Arial", Font.BOLD, 20));
		boton_resultado.setBackground(new Color(14, 227, 100));
		add(boton_resultado);

		boton_raizCuadrada = new JButton("???");
		boton_raizCuadrada.setBounds(20, 490, 125, 50);
		boton_raizCuadrada.setFont(new Font("Arial", Font.BOLD, 20));
		boton_raizCuadrada.setBackground(new Color(205, 205, 205));
		add(boton_raizCuadrada);

		boton_raizCubica = new JButton("?????");
		boton_raizCubica.setBounds(150, 490, 125, 50);
		boton_raizCubica.setFont(new Font("Arial", Font.BOLD, 20));
		boton_raizCubica.setBackground(new Color(205, 205, 205));
		add(boton_raizCubica);

		cuadro_entrada = new JTextField();
		cuadro_entrada.setBounds(20, 210, 320, 50);
		cuadro_entrada.setBackground(new Color(220, 220, 220));
		cuadro_entrada.setFont(new Font("Arial", Font.BOLD, 24));
		cuadro_entrada.setText("0");
		add(cuadro_entrada);

		cuadro_resultado = new JTextArea();
		cuadro_resultado.setBounds(20, 20, 320, 180);
		cuadro_resultado.setFont(new Font("Arial", Font.BOLD, 24));
		cuadro_resultado.setEditable(false);

		scroll = new JScrollPane(cuadro_resultado);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(cuadro_resultado);
		add(scroll);

		Color background = new Color(75,75,75);
		Container main = getContentPane();
		main.setBackground(background);

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

	public JButton getBoton_signo() {
		return boton_signo;
	}

	public JButton getBoton_resultado() {
		return boton_resultado;
	}

	public JButton getBoton_raizCuadrada() {
		return boton_raizCuadrada;
	}

	public JButton getBoton_raizCubica() {
		return boton_raizCubica;
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
		boton_signo.addActionListener(eventhandler);
		boton_resultado.addActionListener(eventhandler);
		boton_raizCuadrada.addActionListener(eventhandler);
		boton_raizCubica.addActionListener(eventhandler);
		cuadro_entrada.requestFocus();
		cuadro_entrada.setText("");

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
		resultados.add(s + "\n");
		this.cuadro_resultado.setText(listarResultados(resultados));
	}

	public void resetEntrada() {
		operandos[0] = "";
		operandos[1] = "";
		operandos[2] = "";
		setCuadro_entrada();
		boton_signo.setEnabled(true);
	}

	public String listarResultados(List<String> resultados) {
		String resultados_string = "";
		for (int i = 0; i < resultados.size(); i++) {
			resultados_string = resultados_string + resultados.get(i);

		}
		return resultados_string;
	}

	public void campoActivo(String s) {
		if (operandos[1].equals("")) {
			if (!operandos[0].startsWith("0")) {
				operandos[0] = operandos[0] + s;
				hacerDecimalesCampo0();
				ceroComa(s);
				ponerSignoCampo0();
			} else {
				operandos[0] = operandos[0].substring(1) + s;
				hacerDecimalesCampo0();
				ceroComa(s);
				ponerSignoCampo0();
			}

		} else {
			operandos[2] = operandos[2] + s;
			hacerDecimalesCampo2();
			ponerSignoCampo2();

		}
		setCuadro_entrada();
	}

	public void hacerDecimalesCampo0() {
		if (operandos[0].contains(".")) {
			boton_coma.setEnabled(false);
		} else {
			boton_coma.setEnabled(true);
		}
	}

	public void hacerDecimalesCampo2() {

		if (!operandos[2].contains(".")) {
			boton_coma.setEnabled(true);
		} else {
			boton_coma.setEnabled(false);
		}
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public void ceroComa(String s) {
		if (operandos[0].equals("." + s)) {
			operandos[0] = "0" + operandos[0];
		}
	}


	public void ponerSignoCampo0() {
		if (operandos[0].contains("-")) {
			boton_signo.setEnabled(false);

		}

	}

	public void ponerSignoCampo2() {

		if (operandos[2].contains("-")) {
			boton_signo.setEnabled(false);
		}
	}

	private boolean verificarCaracterNumerico(String ultimoNumero) {
		return ultimoNumero.equals("0") || ultimoNumero.equals("1") || ultimoNumero.equals("2")
				|| ultimoNumero.equals("3") || ultimoNumero.equals("4") || ultimoNumero.equals("5")
				|| ultimoNumero.equals("6") || ultimoNumero.equals("7") || ultimoNumero.equals("8")
				|| ultimoNumero.equals("9");
	}


	public void calcular() {
		try {
			double resultado = 0.0;
			String ultimoNumero = operandos[2].substring(operandos[2].length() - 1);
			switch (operandos[1]) {
				case "+":
					if (verificarCaracterNumerico(ultimoNumero)) {
						resultado = Double.parseDouble(operandos[0]) + Double.parseDouble(operandos[2]);
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					} else {
						resultado = Double.parseDouble(operandos[0])
								+ Double.parseDouble(operandos[2].substring(0, operandos[2].length() - 1));
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					}
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
				case "-":
					if (verificarCaracterNumerico(ultimoNumero)) {
						resultado = Double.parseDouble(operandos[0]) - Double.parseDouble(operandos[2]);
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					} else {
						resultado = Double.parseDouble(operandos[0])
								- Double.parseDouble(operandos[2].substring(0, operandos[2].length() - 1));
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					}
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
				case "*":
					if (verificarCaracterNumerico(ultimoNumero)) {
						resultado = Double.parseDouble(operandos[0]) * Double.parseDouble(operandos[2]);
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					} else {
						resultado = Double.parseDouble(operandos[0])
								* Double.parseDouble(operandos[2].substring(0, operandos[2].length() - 1));
						setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
					}
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
				case "/":
					if (verificarCaracterNumerico(ultimoNumero)) {
						if (!(Double.parseDouble(operandos[2]) == 0)) {
							resultado = Double.parseDouble(operandos[0]) / Double.parseDouble(operandos[2]);
							setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
						} else {
							JFrame divisorCero = new JFrame();
							JOptionPane.showMessageDialog(divisorCero, "El divisor debe ser " + "\ndistinto de cero");
						}
					} else {
						if (!(Double.parseDouble(operandos[2]) == 0)) {
							resultado = Double.parseDouble(operandos[0])
									/ Double.parseDouble(operandos[2].substring(0, operandos[2].length() - 1));
							setCuadro_resultado(operandos[0] + operandos[1] + operandos[2] + " = " + resultado);
						} else {
							JFrame divisorCero = new JFrame();
							JOptionPane.showMessageDialog(divisorCero, "El divisor debe ser " + "\ndistinto de cero");
						}

					}
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
				case "???":
					JFrame noDisponible = new JFrame();
					JOptionPane.showMessageDialog(noDisponible, "Funcionalidad no disponible");
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
				case "?????":
					JFrame askPass = new JFrame();
					String pass = JOptionPane.showInputDialog(askPass, "Introduzca la contrase??a");
					if (pass.equals("1234")) {
						resultado = Math.cbrt(Double.parseDouble(operandos[2]));
						setCuadro_resultado(operandos[1] + operandos[2] + "=" + resultado);
					} else {
						JFrame error = new JFrame();
						JOptionPane.showMessageDialog(error, "Contrase??a incorrecta");
					}
					resetEntrada();
					cuadro_entrada.requestFocus();
					break;
			}

					} catch (StringIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {

					}
	}

	public void suma() {
		operandos[1] = "+";
		boton_signo.setEnabled(true);
		setCuadro_entrada();
	}

	public void resta() {
		operandos[1] = "-";
		boton_signo.setEnabled(true);
		setCuadro_entrada();
	}

	public void dividir() {
		operandos[1] = "/";
		boton_signo.setEnabled(true);
		setCuadro_entrada();
	}

	public void multiplicar() {
		operandos[1] = "*";
		boton_signo.setEnabled(true);
		setCuadro_entrada();
	}

	public void raizCuadrada() {
		operandos[1] = "???";
		boton_signo.setEnabled(true);
		setCuadro_entrada();
	}

	public void raizCubica() {
		operandos[1] = "?????";
		boton_signo.setEnabled(false);
		setCuadro_entrada();
	}

}
