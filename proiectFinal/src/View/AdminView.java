package View;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminView {

	private JFrame frame;
	private JTextField iduser;
	private JTextField username;
	private JTextField pass;
	private JTextField iddoctor;
	private JTextField name;
	private JTextField adresa;
	private JTextField specializare;
	
	private JButton btnUpdateUser;
	private JButton btnListUsers;
	private JButton btnAddDoctor;
	private JButton btnDeleteDoctor;
	private JButton btnUpdateDoctor;
	private JButton btnListDoctors;
	private JButton btnLogOut;
	private JLabel lblType;
	private JTextField tip;

	
	/**
	 * Create the application.
	 */
	public AdminView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(33, 59, 64, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(33, 88, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblIdUser = new JLabel("Id user");
		lblIdUser.setBounds(33, 30, 56, 16);
		frame.getContentPane().add(lblIdUser);
		
		iduser = new JTextField();
		iduser.setBounds(116, 27, 116, 22);
		frame.getContentPane().add(iduser);
		iduser.setColumns(10);
		
		username = new JTextField();
		username.setBounds(116, 56, 116, 22);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(116, 88, 116, 22);
		frame.getContentPane().add(pass);
		pass.setColumns(10);
		
		btnUpdateUser = new JButton("Update user");
		btnUpdateUser.setBounds(12, 176, 109, 25);
		frame.getContentPane().add(btnUpdateUser);
		
		btnListUsers = new JButton("List users");
		btnListUsers.setBounds(135, 176, 111, 25);
		frame.getContentPane().add(btnListUsers);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(213, 283, 97, 25);
		frame.getContentPane().add(btnLogOut);
		
		JLabel lblIdDoctor = new JLabel("Id doctor");
		lblIdDoctor.setBounds(291, 30, 56, 16);
		frame.getContentPane().add(lblIdDoctor);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(291, 59, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(291, 88, 56, 16);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblSpecializare = new JLabel("Specializare");
		lblSpecializare.setBounds(291, 126, 69, 16);
		frame.getContentPane().add(lblSpecializare);
		
		iddoctor = new JTextField();
		iddoctor.setBounds(382, 24, 116, 22);
		frame.getContentPane().add(iddoctor);
		iddoctor.setColumns(10);
		
		name = new JTextField();
		name.setBounds(382, 56, 116, 22);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		adresa = new JTextField();
		adresa.setBounds(382, 85, 116, 22);
		frame.getContentPane().add(adresa);
		adresa.setColumns(10);
		
		specializare = new JTextField();
		specializare.setBounds(382, 123, 116, 22);
		frame.getContentPane().add(specializare);
		specializare.setColumns(10);
		
		btnAddDoctor = new JButton("Add doctor");
		btnAddDoctor.setBounds(291, 176, 117, 25);
		frame.getContentPane().add(btnAddDoctor);
		
		btnDeleteDoctor = new JButton("Delete doctor");
		btnDeleteDoctor.setBounds(420, 176, 116, 25);
		frame.getContentPane().add(btnDeleteDoctor);
		
		btnUpdateDoctor = new JButton("Update doctor");
		btnUpdateDoctor.setBounds(291, 227, 121, 25);
		frame.getContentPane().add(btnUpdateDoctor);
		
		btnListDoctors = new JButton("List doctors");
		btnListDoctors.setBounds(423, 227, 113, 25);
		frame.getContentPane().add(btnListDoctors);
		
		lblType = new JLabel("Type");
		lblType.setBounds(33, 126, 56, 16);
		frame.getContentPane().add(lblType);
		
		tip = new JTextField();
		tip.setBounds(116, 123, 116, 22);
		frame.getContentPane().add(tip);
		tip.setColumns(10);
	}
	
	public JTextField getTip()
	{
		return this.tip;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getIduser() {
		return iduser;
	}

	public JTextField getUsername() {
		return username;
	}

	public JTextField getPass() {
		return pass;
	}


	public JTextField getIddoctor() {
		return iddoctor;
	}

	public JTextField getName() {
		return name;
	}

	public JTextField getAdresa() {
		return adresa;
	}

	public JTextField getSpecializare() {
		return specializare;
	}
	
	//Butoane
	public void updateUser(ActionListener metoda)
    {
        btnUpdateUser.addActionListener(metoda);
    }
	
	public void listUsers(ActionListener metoda)
	{
		btnListUsers.addActionListener(metoda);
	}
	
	public void addDoctor (ActionListener metoda)
	{
		btnAddDoctor.addActionListener(metoda);
	}
	
	public void deleteDoctor(ActionListener metoda)
	{
		btnDeleteDoctor.addActionListener(metoda);
	}
	
	public void updateDoctor(ActionListener metoda)
    {
        btnUpdateDoctor.addActionListener(metoda);
    }
	
	public void listDoctors(ActionListener metoda)
	{
		btnListDoctors.addActionListener(metoda);
	}
	
	public void logOut(ActionListener metoda)
	{
		btnLogOut.addActionListener(metoda);
	}

}
