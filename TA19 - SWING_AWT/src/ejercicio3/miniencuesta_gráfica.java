package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class miniencuesta_gráfica extends JFrame {

	private JPanel contentPane;

	// Método main que ejecuta el frame principal
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { // Método run 
				try {
					// Invocamos la instancia del frame
					miniencuesta_gráfica frame = new miniencuesta_gráfica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Método con toda la funcionalidas principal
	public miniencuesta_gráfica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(10, 11, 270, 14);
		contentPane.add(lblNewLabel);
		
		// Botones para seleccionar el sistema operativo
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(10, 32, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(10, 58, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(10, 84, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		// Grupo en el que almacenamos los radioButtons
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad/es:");
		lblNewLabel_1.setBounds(10, 114, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(10, 135, 145, 23);
		contentPane.add(chckbxNewCheckBox);
		
		// Botones check en el que seleccionamos las diferentes aptitudes
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(10, 161, 145, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(10, 187, 162, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		// Slider en el que realizamos el conteo de las horas
		JSlider slider = new JSlider(0,10);
		JLabel valorSlider = new JLabel("Valor del slider: " + slider.getValue());
		valorSlider.setBounds(10, 298, 270, 14);
		
		// Event Listener del slider en el que iremos actualizando en una label el valor
		// actual del slider
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valorSlider.setText("Valor seleccionado: " + slider.getValue());
			}
		});
		
		// Mostramos las lineas del slider
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		// Definimos el spacing del slider
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		
		slider.setBounds(10, 242, 200, 45);
		contentPane.add(slider);
		contentPane.add(valorSlider);
		
		// Boton en el que enviamos el formulario
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(new ActionListener() {
			
			// Método actionPerformed en el que controlaremos que hace el boton
			// cuando lo clicamos
			public void actionPerformed(ActionEvent e) {
				
				// Strings en las que concatenaremos los diferentes valores
				String botonSeleccionado = "Sistema operativo: \n";
				String botonesSeleccionadosAptitudes = "Aptitudes: \n";
				
				// Controlamos que radioButtons estan seleccionados y concatenamos en la string
				// del botonSeleccionado el valor que contiene el radioButton
				if(rdbtnNewRadioButton.isSelected()) {
					botonSeleccionado += " > "+rdbtnNewRadioButton.getText();
				} else if(rdbtnNewRadioButton_1.isSelected()) {
					botonSeleccionado += " > "+rdbtnNewRadioButton_1.getText();
				} else if(rdbtnNewRadioButton_2.isSelected()) {
					botonSeleccionado += " > "+rdbtnNewRadioButton_2.getText();
				}
				
				// Controlamos que checkButtons estan seleccionados y los concatenamos a la 
				// string de los checkButtons
				if(chckbxNewCheckBox.isSelected()) {
					botonesSeleccionadosAptitudes += " > "+chckbxNewCheckBox.getText() + "\n";
				}
				if(chckbxNewCheckBox_1.isSelected()) {
					botonesSeleccionadosAptitudes += " > "+chckbxNewCheckBox_1.getText() + "\n";
				}
				if(chckbxNewCheckBox_2.isSelected()) {
					botonesSeleccionadosAptitudes += " > "+chckbxNewCheckBox_2.getText() + "\n";
				}
				
				// Finalmente mediante un JOptionPane mostramos toda la información
				JOptionPane.showMessageDialog(btnNewButton, botonSeleccionado + "\n" + botonesSeleccionadosAptitudes + "\n" + "Horas dedicadas en el PC: \n" + " > " + slider.getValue());
			}
		});
		btnNewButton.setFont(new Font("Unispace", Font.BOLD, 14));
		btnNewButton.setBounds(283, 135, 123, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas: ");
		lblNewLabel_2.setBounds(10, 217, 170, 14);
		contentPane.add(lblNewLabel_2);
	}
}
