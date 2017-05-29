package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.*;
import View.*;

public class PatientController {
	private LogInView log;
	private PatientView patientpanel;
	private DiagnosisDAO d;
	private AppointmentDAO dl;
	private Display panel;
	
	public PatientController(LogInView log,PatientView patientpanel,DiagnosisDAO d,AppointmentDAO dl,Display panel)
	{
		this.log=log;
		this.patientpanel=patientpanel;
		this.d=d;
		this.dl=dl;
		this.panel=panel;
		
		patientpanel.appointment(new appoint());
		patientpanel.logOut(new logout());
		patientpanel.diagnosis(new diagnose());
	}
	
	class appoint implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int consultNr = Integer.parseInt(patientpanel.getIdConsult().getText());
			String doctorName=patientpanel.getDoctorName().getText();
			String patientName=patientpanel.getPatientName().getText();
			String dateC=patientpanel.getData().getText();
			String details=patientpanel.getDetails().getText();
			Appointment a=new Appointment(consultNr,doctorName,patientName,dateC,details,"Pending");
			
			if(dl.checkAvailability(doctorName, dateC))
			{
			dl.insert(a);
			}
			else
				{
				panel.getFrame().setVisible(true);
				panel.getTextArea().setText("Doctorul nu este disponibil.");
				}
		}
	}
	
	class diagnose implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ArrayList<String> list=d.listDiagnosis(patientpanel.getSimptom().getText());
			String s="Diagnosticul este: ";
			for(int i=0;i<list.size();i++)
			{
				s+=list.get(i);
			}
			panel.getFrame().setVisible(true);
			panel.getTextArea().setText(s);
			
		}
	}
	
	class logout implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			patientpanel.getFrame().setVisible(false);
			log.getFrame().setVisible(true);
		}
	}
}
