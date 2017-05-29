package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.*;
import View.*;



public class LogInController {
	private DoctorView doctorpanel;
	private PatientView patientpanel;
	private UserDAO u;
	private PatientDAO p;
	private AdminView adminpanel;
	private LogInView log;
	private RegisterForm regpanel;
	
	public LogInController(AdminView ap, DoctorView dp,PatientView pp,  UserDAO u, LogInView log,RegisterForm regpanel)
	{
		this.doctorpanel=dp;
		this.patientpanel=pp;
		this.adminpanel=ap;
		this.u=u;
		this.log=log;
		this.regpanel=regpanel;
		
		log.logIn(new login());
		log.register(new reg());
			
	}
	
	class login implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(u.login(log.getTextField().getText(),log.getPasswordField().getText()).equals("Patient"))
			{
				patientpanel.getFrame().setVisible(true);
				log.getFrame().setVisible(false);
			}
			if(u.login(log.getTextField().getText(),log.getPasswordField().getText()).equals("Admin"))
			{
				adminpanel.getFrame().setVisible(true);
				log.getFrame().setVisible(false);
			}
				if(u.login(log.getTextField().getText(),log.getPasswordField().getText()).equals("Doctor"))
				{doctorpanel.getFrame().setVisible(true);
				log.getFrame().setVisible(false);}
			 
			
		}
		}
	
	
	class reg implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			regpanel.getFrame().setVisible(true);
			
		}
	}
}
