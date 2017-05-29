package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;

import Model.*;
import View.*;
import Pattern.*;


public class DoctorController {
	private DoctorView doctorpanel;
	private AppointmentDAO d;
	private Display panel;
	private LogInView log;
	private ReportFactory reportFactory = new ReportFactory();
    private Report report1 = reportFactory.getReport("PDF");
    private Report report2 = reportFactory.getReport("CSV");

	
	public DoctorController (DoctorView doctorpanel,AppointmentDAO d, Display panel,LogInView log) throws FileNotFoundException, DocumentException
	{
		this.doctorpanel=doctorpanel;
		this.d=d;
		this.panel=panel;
		this.log=log;
		
		this.doctorpanel.issueBills(new bills());
		this.doctorpanel.listConsultations(new listConsult());
		this.doctorpanel.updateConsultation(new update());
		
		this.doctorpanel.logOut(new logout());
	}
	
	class listConsult implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String doctor=doctorpanel.getDoctor().getText();
			String status=doctorpanel.getStatus().getText();
			//int idConsult=Integer.parseInt(doctorpanel.getIdConsult().getText());
			ArrayList<String> list=d.listAppointments(status, doctor);
			
			String s="ConsultNr        NumeDoctor          NumePacient         DataC           Details           State"+"\n";
			panel.getFrame().setVisible(true);
			for(int i = 0; i < list.size(); i++) {   
				s=s+list.get(i)+"\n";
			}
			panel.getTextArea().setText(s);
		}
	}
	
	class bills implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ArrayList<Appointment> list=new ArrayList<Appointment>();
			list=d.listAppointment();
			if(doctorpanel.getTip().getText().equals("PDF")){
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getConsultNr()==Integer.parseInt(doctorpanel.getIdConsult().getText())){
					report1.generateReport(list.get(i).getDoctorName(), list.get(i).getPrice()+"");
			}
			}
			PDF.document.close();
			}
			else if(doctorpanel.getTip().getText().equals("CSV"))
			{
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getConsultNr()==Integer.parseInt(doctorpanel.getIdConsult().getText()))
					report2.generateReport(list.get(i).getDoctorName(), list.get(i).getPrice()+"");
				}
			}
		}
	}
	
	
	class update implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			d.update(Integer.parseInt(doctorpanel.getIdConsult().getText()), doctorpanel.getStatus().getText(), Integer.parseInt(doctorpanel.getPrice().getText()));
		}
	}
	
	class logout implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			doctorpanel.getFrame().setVisible(false);
			log.getFrame().setVisible(true);
		}
	}
}
