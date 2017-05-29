package View;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterForm {

	private JFrame frame;
	private JTextField cnp;
	private JTextField name;
	private JTextField address;
	private JTextField dateOfBirth;
	private JTextField username;
	private JTextField passw;
	
	private JButton btnRegister;
	private JTextField id_user;
	private JLabel lblId;

	public JTextField getId()
	{
		return this.id_user;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public JTextField getCnp() {
		return cnp;
	}

	public JTextField getName() {
		return name;
	}

	public JTextField getAddress() {
		return address;
	}

	public JTextField getDateOfBirth() {
		return dateOfBirth;
	}

	public JTextField getUsername() {
		return username;
	}

	public JTextField getPassw() {
		return passw;
	}

	/**
	 * Create the application.
	 */
	public RegisterForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 285, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(77, 239, 97, 25);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblCnp = new JLabel("CNP");
		lblCnp.setBounds(12, 23, 56, 16);
		frame.getContentPane().add(lblCnp);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 52, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(12, 81, 56, 16);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblDateofbirth = new JLabel("DateOfBirth");
		lblDateofbirth.setBounds(12, 110, 71, 16);
		frame.getContentPane().add(lblDateofbirth);
		
		cnp = new JTextField();
		cnp.setBounds(92, 20, 116, 22);
		frame.getContentPane().add(cnp);
		cnp.setColumns(10);
		
		name = new JTextField();
		name.setBounds(92, 49, 116, 22);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(92, 78, 116, 22);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		dateOfBirth = new JTextField();
		dateOfBirth.setBounds(92, 107, 116, 22);
		frame.getContentPane().add(dateOfBirth);
		dateOfBirth.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(12, 144, 71, 16);
		frame.getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setBounds(92, 142, 116, 22);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 178, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		passw = new JTextField();
		passw.setBounds(92, 177, 116, 22);
		frame.getContentPane().add(passw);
		passw.setColumns(10);
		
		id_user = new JTextField();
		id_user.setBounds(92, 212, 116, 22);
		frame.getContentPane().add(id_user);
		id_user.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(12, 215, 56, 16);
		frame.getContentPane().add(lblId);
	}
	
	public void registerForm(ActionListener metoda)
	{
		btnRegister.addActionListener(metoda);
	}

}
