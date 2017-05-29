package View;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LogInView {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnRegister;
	private JButton btnLogIn;

	
	/**
	 * Create the application.
	 */
	public LogInView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(75, 189, 97, 25);
		frame.getContentPane().add(btnLogIn);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(50, 46, 68, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 104, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(144, 46, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 101, 116, 22);
		frame.getContentPane().add(passwordField);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(218, 189, 97, 25);
		frame.getContentPane().add(btnRegister);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	
	//Buttons
	public void register(ActionListener metoda)
	{
		btnRegister.addActionListener(metoda);
	}
	
	public void logIn(ActionListener metoda)
	{
		btnLogIn.addActionListener(metoda);
	}
}
