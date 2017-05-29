package View;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class PatientView {

	private JFrame frame;
	private JTextField simptom;
	private JTextField data;
	private JButton btnAppointment;
	private JButton btnDiagnosis;
	private JButton btnLogOut;
	private JLabel lblNrconsult;
	private JTextField idConsult;
	private JLabel lblDetails;
	private JTextField details;
	private JLabel lblPatientName;
	private JTextField Pname;
	private JTextField doctorN;

	
	/**
	 * Create the application.
	 */
	public PatientView() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getSimptom() {
		return simptom;
	}

	public JTextField getData() {
		return data;
	}

	public JTextField getDoctorName() {
		return doctorN;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 349, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDoctorName = new JLabel("Doctor name");
		lblDoctorName.setBounds(12, 13, 80, 16);
		frame.getContentPane().add(lblDoctorName);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(12, 48, 56, 16);
		frame.getContentPane().add(lblDate);
		
		JLabel lblSimptom = new JLabel("Simptom");
		lblSimptom.setBounds(12, 178, 56, 16);
		frame.getContentPane().add(lblSimptom);
		
		simptom = new JTextField();
		simptom.setBounds(108, 175, 116, 22);
		frame.getContentPane().add(simptom);
		simptom.setColumns(10);
		
		data = new JTextField();
		data.setBounds(108, 45, 116, 22);
		frame.getContentPane().add(data);
		data.setColumns(10);
		
		btnAppointment = new JButton("Appointment");
		btnAppointment.setBounds(12, 232, 105, 25);
		frame.getContentPane().add(btnAppointment);
		
		btnDiagnosis = new JButton("Diagnosis");
		btnDiagnosis.setBounds(132, 232, 97, 25);
		frame.getContentPane().add(btnDiagnosis);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(65, 270, 97, 25);
		frame.getContentPane().add(btnLogOut);
		
		lblNrconsult = new JLabel("NrConsult");
		lblNrconsult.setBounds(12, 80, 56, 16);
		frame.getContentPane().add(lblNrconsult);
		
		idConsult = new JTextField();
		idConsult.setBounds(108, 77, 116, 22);
		frame.getContentPane().add(idConsult);
		idConsult.setColumns(10);
		
		lblDetails = new JLabel("Details");
		lblDetails.setBounds(12, 109, 56, 16);
		frame.getContentPane().add(lblDetails);
		
		details = new JTextField();
		details.setBounds(108, 108, 116, 22);
		frame.getContentPane().add(details);
		details.setColumns(10);
		
		lblPatientName = new JLabel("Patient name");
		lblPatientName.setBounds(12, 149, 80, 16);
		frame.getContentPane().add(lblPatientName);
		
		Pname = new JTextField();
		Pname.setBounds(108, 146, 116, 22);
		frame.getContentPane().add(Pname);
		Pname.setColumns(10);
		
		doctorN = new JTextField();
		doctorN.setBounds(108, 10, 116, 22);
		frame.getContentPane().add(doctorN);
		doctorN.setColumns(10);
	}
	public JTextField getPatientName()
	{
		return this.Pname;
	}
	
	public JTextField getDetails()
	{
		return this.details;
	}
	
	public JTextField getIdConsult()
	{
		return this.idConsult;
	}
	
	public void appointment(ActionListener metoda)
    {
        btnAppointment.addActionListener(metoda);
    }
	
	public void diagnosis(ActionListener metoda)
	{
		btnDiagnosis.addActionListener(metoda);
	}
	
	public void logOut(ActionListener metoda)
	{
		btnLogOut.addActionListener(metoda);
	}
}
