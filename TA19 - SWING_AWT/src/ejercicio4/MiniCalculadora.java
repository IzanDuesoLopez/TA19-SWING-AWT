package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("serial")
public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ArrayList<String> operaciones = new ArrayList<>(Arrays.asList("", "", "", ""));
	private boolean mostrar_operaciones = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(81, 100, 134, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(250, 100, 134, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setBounds(480, 100, 119, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addMouseListener(new MouseAdapter() {
			/**
			 * Recoge los valores de los dos campos de texto, estos se parsean a tipo float,
			 * se ejecuta la operación correspondiente entre los dos valores, 
			 * se pasa el valor resultante al último campo de texto 
			 * y se añade este valor a la primera posición de la arraylist encargada de almacenar las últimas operaciones realizadas
			 * 
			 * @param e acción de un ratón que ocurre en el componente
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value + second_value;
				
				textField_2.setText("" + result);
				
				operaciones.add(0, textField.getText() + " + " + textField_1.getText() + " = " + result);
			}
		});
		btnNewButton.setBounds(108, 203, 85, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			/**
			 * Recoge los valores de los dos campos de texto, estos se parsean a tipo float,
			 * se ejecuta la operación correspondiente entre los dos valores, 
			 * se pasa el valor resultante al último campo de texto 
			 * y se añade este valor a la primera posición de la arraylist encargada de almacenar las últimas operaciones realizadas
			 * 
			 * @param e acción de un ratón que ocurre en el componente
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value - second_value;
				
				textField_2.setText("" + result);
				
				operaciones.add(0, textField.getText() + " - " + textField_1.getText() + " = " + result);
			}
		});
		btnNewButton_1.setBounds(279, 203, 85, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			/**
			 * Recoge los valores de los dos campos de texto, estos se parsean a tipo float,
			 * se ejecuta la operación correspondiente entre los dos valores, 
			 * se pasa el valor resultante al último campo de texto 
			 * y se añade este valor a la primera posición de la arraylist encargada de almacenar las últimas operaciones realizadas
			 * 
			 * @param e acción de un ratón que ocurre en el componente
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value * second_value;
				
				textField_2.setText("" + result);
				
				operaciones.add(0, textField.getText() + " x " + textField_1.getText() + " = " + result);
			}
		});
		btnNewButton_2.setBounds(108, 263, 85, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			/**
			 * Recoge los valores de los dos campos de texto, estos se parsean a tipo float,
			 * se ejecuta la operación correspondiente entre los dos valores, 
			 * se pasa el valor resultante al último campo de texto 
			 * y se añade este valor a la primera posición de la arraylist encargada de almacenar las últimas operaciones realizadas
			 * 
			 * @param e acción de un ratón que ocurre en el componente
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value / second_value;
				
				textField_2.setText("" + result);
				
				operaciones.add(0, textField.getText() + " / " + textField_1.getText() + " = " + result);
			}
		});
		btnNewButton_3.setBounds(279, 263, 85, 35);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(411, 111, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(523, 274, 76, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(516, 302, 83, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(523, 330, 79, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(523, 353, 76, 13);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_4 = new JButton("About");
		btnNewButton_4.addActionListener(new ActionListener() {
			/**
			 * Pasa los cuatro primeros valores de la arraylist de las últimas operaciones realizadas a los etiquetas de texto
			 * y cambia el estado de estas etiquetas de visible a invisible o viceversa
			 * 
			 * @param e acción ocurrida en un componente
			 */
			public void actionPerformed(ActionEvent e) {
				mostrar_operaciones = !mostrar_operaciones;
				
				lblNewLabel_4.setText(operaciones.get(0));
				lblNewLabel_5.setText(operaciones.get(1));
				lblNewLabel_6.setText(operaciones.get(2));
				lblNewLabel_7.setText(operaciones.get(3));
				
				lblNewLabel_4.setVisible(mostrar_operaciones);
				lblNewLabel_5.setVisible(mostrar_operaciones);
				lblNewLabel_6.setVisible(mostrar_operaciones);
				lblNewLabel_7.setVisible(mostrar_operaciones);
				
			}
		});
		btnNewButton_4.setBounds(516, 210, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setBounds(123, 77, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(292, 77, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(495, 77, 85, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			/**
			 * Vacía los valores de los tres campos de texto
			 * 
			 * @param e acción de un ratón que ocurre en el componente
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnNewButton_5.setBounds(196, 342, 85, 35);
		contentPane.add(btnNewButton_5);
		
		
	}
}
