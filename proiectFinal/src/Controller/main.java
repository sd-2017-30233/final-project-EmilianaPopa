package Controller;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import Model.*;

import View.*;


public class main {
	public static void main(String[] args) throws FileNotFoundException, DocumentException
	{
		//Models
		UserDAO ud=new UserDAO();
		DiagnosisDAO dd=new DiagnosisDAO();
		PatientDAO pd=new PatientDAO();
		DoctorDAO docd=new DoctorDAO();
		AppointmentDAO ad=new AppointmentDAO();
		
		//Views
		AdminView adminpanel=new AdminView();
		PatientView patientpanel=new PatientView();
		Display panel=new Display();
		LogInView logpanel = new LogInView();
		DoctorView docpanel = new DoctorView();
		RegisterForm regpanel= new RegisterForm();
		
		//Controll
		AdminController adminC = new AdminController(adminpanel,docd,ud,panel,logpanel);
		PatientController patientC=new PatientController(logpanel,patientpanel,dd,ad,panel);
		LogInController loginC = new LogInController(adminpanel,docpanel,patientpanel,ud,logpanel,regpanel);
		DoctorController doctorC=new DoctorController(docpanel,ad,panel,logpanel);
		RegisterController regC=new RegisterController(regpanel,pd);
		
		logpanel.getFrame().setVisible(true);
		
		
	}
}
