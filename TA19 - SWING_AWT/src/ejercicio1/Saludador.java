package ejercicio1;

import java.awt.TextField;

import javax.swing.*;

public class Saludador extends JFrame{
	
	private JPanel contentPane;
	
	public Saludador() {
		
		setTitle("Ventana Saludador"); // Titulo de la ventana
		setBounds(500,200,300,350); // Dimensiones de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerremos la ventana se acaba la aplicacion
		setVisible(true); // Hacemos visible la ventana
		
		contentPane = new JPanel(); // Creamos el panel principal
		contentPane.setLayout(null); // Indicamos su diseño
		
		setContentPane(contentPane); // Asignamos el panel a la ventana
		
		JLabel etiqueta = new JLabel("Saluditos");
		etiqueta.setBounds(60, 20, 100, 200);
		contentPane.add(etiqueta);
		
		JTextField textField = new JTextField();
		textField.setBounds(50,150,90,30);
		contentPane.add(textField);
	}
	
}
