package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField txtPostDePrueba;
	private JTextField txtPostDePrueba_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JSeparator separator_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 455, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, separator, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, separator, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, separator, 62, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, separator, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(separator);
		
		txtPostDePrueba = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtPostDePrueba, 6, SpringLayout.SOUTH, separator);
		springLayout.putConstraint(SpringLayout.WEST, txtPostDePrueba, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtPostDePrueba, 49, SpringLayout.SOUTH, separator);
		springLayout.putConstraint(SpringLayout.EAST, txtPostDePrueba, 268, SpringLayout.WEST, frame.getContentPane());
		txtPostDePrueba.setBackground(UIManager.getColor("CheckBox.background"));
		txtPostDePrueba.setForeground(Color.BLACK);
		txtPostDePrueba.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtPostDePrueba.setText("Post de prueba");
		txtPostDePrueba.setEditable(false);
		frame.getContentPane().add(txtPostDePrueba);
		txtPostDePrueba.setColumns(10);
		
		txtPostDePrueba_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtPostDePrueba_1, -258, SpringLayout.EAST, separator);
		txtPostDePrueba_1.setText("Post de prueba");
		txtPostDePrueba_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtPostDePrueba_1.setBackground(UIManager.getColor("Button.background"));
		springLayout.putConstraint(SpringLayout.NORTH, txtPostDePrueba_1, 23, SpringLayout.SOUTH, txtPostDePrueba);
		springLayout.putConstraint(SpringLayout.SOUTH, txtPostDePrueba_1, 66, SpringLayout.SOUTH, txtPostDePrueba);
		springLayout.putConstraint(SpringLayout.EAST, txtPostDePrueba_1, 0, SpringLayout.EAST, separator);
		frame.getContentPane().add(txtPostDePrueba_1);
		txtPostDePrueba_1.setColumns(10);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 19, SpringLayout.SOUTH, txtPostDePrueba_1);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, lblNewLabel);
		textField.setText("Post de prueba");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setColumns(10);
		textField.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 252, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -18, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, separator);
		textField_1.setText("Post de prueba");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_1.setColumns(10);
		textField_1.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 312, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -22, SpringLayout.NORTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 10, SpringLayout.WEST, frame.getContentPane());
		textField_2.setText("Post de prueba");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_2.setColumns(10);
		textField_2.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, -18, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 368, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField_3, -155, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, separator);
		textField_3.setText("Post de prueba");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_3.setColumns(10);
		textField_3.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(textField_3);
		
		separator_1 = new JSeparator();
		springLayout.putConstraint(SpringLayout.WEST, separator_1, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_1, -67, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, separator_1, 0, SpringLayout.EAST, separator);
		separator_1.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(separator_1);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, separator_1, 6, SpringLayout.SOUTH, textField_4);
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 27, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_4, -90, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, lblNewLabel);
		textField_4.setText("Post de prueba");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_4.setColumns(10);
		textField_4.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, separator_1);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -67, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, frame.getContentPane());
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		frame.getContentPane().add(btnNewButton);
		frame.setSize(400,600);
	}
}
