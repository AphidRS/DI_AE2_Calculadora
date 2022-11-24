package controlador;

import vista.MainWindow;

public class Main {

	public static void main(String[] args) {
		
		MainWindow window = new MainWindow();
		Events eventhandler = new Events(window);
		window.setHandler(eventhandler);
	}

}
