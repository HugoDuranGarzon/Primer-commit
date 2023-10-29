package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setBounds(146, 11, 122, 29);
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblCalculadora);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(29, 51, 367, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				String texto=textField.getText();
				textField.setText(texto+"1");
				System.out.println("Se ha introducido el numero 1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(29, 82, 89, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"2");
				System.out.println("Se ha introducido el numero 2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(119, 82, 89, 34);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"3");
				System.out.println("Se ha introducido el numero 3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBounds(210, 82, 89, 34);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"4");
				System.out.println("Se ha introducido el numero 4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBounds(29, 127, 89, 34);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"5");
				System.out.println("Se ha introducido el numero 5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBounds(119, 127, 89, 34);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"6");
				System.out.println("Se ha introducido el numero 6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBounds(210, 127, 89, 34);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"7");
				System.out.println("Se ha introducido el numero 7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBounds(29, 171, 89, 34);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"8");
				System.out.println("Se ha introducido el numero 8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBounds(119, 171, 89, 34);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"9");
				System.out.println("Se ha introducido el numero 9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBounds(210, 171, 89, 34);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"0");
				System.out.println("Se ha introducido el numero 0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn0.setBounds(119, 216, 89, 34);
		contentPane.add(btn0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"+");
				System.out.println("Se ha introducido el caracter +");
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPlus.setBounds(307, 82, 89, 34);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"-");
				System.out.println("Se ha introducido el caracter -");
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMinus.setBounds(309, 127, 89, 34);
		contentPane.add(btnMinus);
		
		JButton btnAsterisk = new JButton("*");
		btnAsterisk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"*");
				System.out.println("Se ha introducido el caracter *");
			}
		});
		btnAsterisk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAsterisk.setBounds(307, 171, 89, 34);
		contentPane.add(btnAsterisk);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto = textField.getText();
				textField.setText(texto+"/");
				System.out.println("Se ha introducido el caracter /");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDivide.setBounds(307, 216, 89, 34);
		contentPane.add(btnDivide);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("No se se como hacer para que haga la operación XD");
				System.out.println("Se ha realizado la operación");
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(210, 216, 89, 34);
		contentPane.add(btnCalcular);
	}
}
