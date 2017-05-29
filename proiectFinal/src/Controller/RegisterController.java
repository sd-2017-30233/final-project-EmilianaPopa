package Controller;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.*;
public class RegisterController {
	private RegisterForm regpanel;
	private PatientDAO p;
	public RegisterController(RegisterForm rf,PatientDAO p)
	{
		this.regpanel=rf;
		this.p=p;
		
		rf.registerForm(new regF());
	}
	
	class regF implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			regpanel.getFrame().setVisible(true);
			String cnp=regpanel.getCnp().getText();
			String name=regpanel.getName().getText();
			String address=regpanel.getAddress().getText();
			String dateOfBirth=regpanel.getAddress().getText();
			String username=regpanel.getUsername().getText();
			String password=regpanel.getPassw().getText();
			int id_user=Integer.parseInt(regpanel.getId().getText());
			User u=new User(id_user,username,password,"Patient");
			Patient p1 = new Patient(cnp,name,address,dateOfBirth);
			p.insert(p1, u);
			regpanel.getFrame().setVisible(false);
		}
	}
}
