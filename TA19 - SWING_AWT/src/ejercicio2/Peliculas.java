package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Peliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el título de una película");
		lblNewLabel.setBounds(31, 75, 292, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();  //Creación de cuadro de texto
		textField.setBounds(41, 111, 96, 20); //Coordenadas de donde está situado el cuadro de texto
		contentPane.add(textField); //Aplicado cuadro de texto en pantalla
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox(); //Creación de menú de selección
		comboBox.setBounds(213, 110, 132, 21); //Coordenadas de donde está situado
		contentPane.add(comboBox); //Aplicado menú de selección en pantalla
		
		JButton btnNewButton = new JButton("Añadir");	//Creación de botón	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText()); //Acción que cuando se pulsa el botón se añade al menú de selección
			}
		});
		
		btnNewButton.setBounds(48, 157, 89, 23); //Coordenadas de donde está situado
		contentPane.add(btnNewButton); //Aplicado botón en pantalla
	}
}
