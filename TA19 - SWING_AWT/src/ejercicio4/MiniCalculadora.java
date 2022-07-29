package ejercicio4;

import java.awt.BorderLayout;
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

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value + second_value;
				
				textField_2.setText("" + result);
			}
		});
		btnNewButton.setBounds(108, 203, 85, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value - second_value;
				
				textField_2.setText("" + result);
			}
		});
		btnNewButton_1.setBounds(279, 203, 85, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value * second_value;
				
				textField_2.setText("" + result);
			}
		});
		btnNewButton_2.setBounds(108, 263, 85, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String first_field = textField.getText();
				String second_field = textField_1.getText();
				
				float first_value = Float.parseFloat(first_field);
				float second_value = Float.parseFloat(second_field);
				
				float result = first_value / second_value;
				
				textField_2.setText("" + result);
			}
		});
		btnNewButton_3.setBounds(279, 263, 85, 35);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(411, 111, 45, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("About");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(499, 241, 85, 21);
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
		lblNewLabel_3.setBounds(516, 77, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
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
