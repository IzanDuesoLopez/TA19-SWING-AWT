package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Saludador extends JFrame{
	
	private JPanel contentPane;
	
	public Saludador() {
		
		setTitle("Ventana Saludador"); // Titulo de la ventana
		setBounds(500,200,300,350); // Dimensiones de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerremos la ventana se acaba la aplicacion
		setVisible(true); // Hacemos visible la ventana
		
		contentPane = new JPanel(); // Creamos el panel principal
		contentPane.setLayout(null); // Indicamos su diseño
		
		
	}
	
}
