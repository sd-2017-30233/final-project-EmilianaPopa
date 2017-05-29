package View;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DoctorView {

	private JFrame frame;
	private JTextField status;
	private JTextField idConsult;
	private JTextField tip;
	
	private JButton btnListConsultations;
	private JButton btnUpdateConsultation;
	private JButton btnIssueBills;
	private JButton btnLogOut;
	private JLabel lblDoctor;
	private JTextField doctor;
	private JLabel lblPrice;
	private JTextField price;

	
	/**
	 * Create the application.
	 */
	public DoctorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 373, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(12, 13, 56, 16);
		frame.getContentPane().add(lblStatus);
		
		status = new JTextField();
		status.setBounds(109, 10, 116, 22);
		frame.getContentPane().add(status);
		status.setColumns(10);
		
		btnListConsultations = new JButton("List appointments");
		btnListConsultations.setBounds(160, 164, 133, 25);
		frame.getContentPane().add(btnListConsultations);
		
		JLabel lblIdConsultation = new JLabel("ID consultation");
		lblIdConsultation.setBounds(12, 42, 84, 16);
		frame.getContentPane().add(lblIdConsultation);
		
		idConsult = new JTextField();
		idConsult.setBounds(109, 45, 116, 22);
		frame.getContentPane().add(idConsult);
		idConsult.setColumns(10);
		
		btnUpdateConsultation = new JButton("Update consultation");
		btnUpdateConsultation.setBounds(85, 202, 145, 25);
		frame.getContentPane().add(btnUpdateConsultation);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(109, 240, 97, 25);
		frame.getContentPane().add(btnLogOut);
		
		btnIssueBills = new JButton("Issue bills");
		btnIssueBills.setBounds(12, 164, 129, 25);
		frame.getContentPane().add(btnIssueBills);
		
		JLabel lblBillType = new JLabel("Bill type");
		lblBillType.setBounds(12, 72, 56, 16);
		frame.getContentPane().add(lblBillType);
		
		tip = new JTextField();
		tip.setBounds(109, 79, 116, 22);
		frame.getContentPane().add(tip);
		tip.setColumns(10);
		
		lblDoctor = new JLabel("Doctor");
		lblDoctor.setBounds(12, 112, 56, 16);
		frame.getContentPane().add(lblDoctor);
		
		doctor = new JTextField();
		doctor.setBounds(109, 109, 116, 22);
		frame.getContentPane().add(doctor);
		doctor.setColumns(10);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(12, 141, 56, 16);
		frame.getContentPane().add(lblPrice);
		
		price = new JTextField();
		price.setBounds(109, 138, 116, 22);
		frame.getContentPane().add(price);
		price.setColumns(10);
	}
	public JTextField getPrice()
	{
		return this.price;
	}
	public JTextField getDoctor()
	{
		return this.doctor;
	}
	public JTextField getTip() {
		return tip;
	}

	public void setTip(JTextField tip) {
		this.tip = tip;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getStatus() {
		return status;
	}

	public JTextField getIdConsult() {
		return idConsult;
	}
	
	//Buttons
	public void updateConsultation(ActionListener metoda)
    {
        btnUpdateConsultation.addActionListener(metoda);
    }
	
	public void listConsultations(ActionListener metoda)
	{
		btnListConsultations.addActionListener(metoda);
	}
	
	public void issueBills (ActionListener metoda)
	{
		btnIssueBills.addActionListener(metoda);
	}
	
	public void logOut(ActionListener metoda)
	{
		btnLogOut.addActionListener(metoda);
	}
}
