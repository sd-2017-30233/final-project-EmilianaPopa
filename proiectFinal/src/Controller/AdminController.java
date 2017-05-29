package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;



import Model.*;
import View.*;


public class AdminController {
	private AdminView adminpanel;
	private DoctorDAO d;
	private UserDAO u;
	private Display panel;
	private LogInView log;

	
	public AdminController (AdminView adminpanel, DoctorDAO d, UserDAO u,Display panel,LogInView log) 
	{
		this.adminpanel=adminpanel;
		this.d=d;
		this.u=u;
		this.panel=panel;
		this.log=log;
		
		this.adminpanel.addDoctor(new adddoctor());
		this.adminpanel.updateDoctor(new updatedoctor());
		this.adminpanel.listDoctors(new viewdoctors());
		this.adminpanel.deleteDoctor(new deletedoctor());
		
		this.adminpanel.updateUser(new updateuser());
		this.adminpanel.listUsers(new viewusers());
		
		this.adminpanel.logOut(new logout());
	}
	
	class adddoctor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int id_doc=Integer.parseInt(adminpanel.getIddoctor().getText());
			String nume=adminpanel.getName().getText();
			String address=adminpanel.getAdresa().getText();
			String specializare=adminpanel.getSpecializare().getText();
			int id_user=Integer.parseInt(adminpanel.getIduser().getText());
			String username=adminpanel.getUsername().getText();
			String password=adminpanel.getPass().getText();
			
			Doctor d1=new Doctor(id_doc,nume,address,specializare);
			User u1 = new User(id_user,username,password);
			u.insert(u1);
			d.insert(d1);
			
		}
	}
	
	class deletedoctor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int id_doctor =Integer.parseInt(adminpanel.getIddoctor().getText());
			int id_user =Integer.parseInt(adminpanel.getIduser().getText());
			
			d.delete(id_doctor,id_user);
		
		}
	}
	
	class updatedoctor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String nume=adminpanel.getName().getText();
			String address=adminpanel.getAdresa().getText();
			String specializare=adminpanel.getSpecializare().getText();
			int id_doc=Integer.parseInt(adminpanel.getIddoctor().getText());
			int id_user=Integer.parseInt(adminpanel.getIduser().getText());
			Doctor d1=new Doctor(id_doc,nume,address,specializare);
			
			d.update(id_doc, d1);
		}
	}
	
	class viewdoctors implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ArrayList<Doctor> list=new ArrayList<Doctor>();
			list=d.listDoctors();
			String s="ID        Nume          Adresa         Specializare"+"\n";
			panel.getFrame().setVisible(true);
			for(int i = 0; i < list.size(); i++) {   
				s=s+list.get(i).getId_doc()+"    "+list.get(i).getNume()+"   "+list.get(i).getAddress()+"    "+list.get(i).getSpecializare()+"\n";
				
			}
			panel.getTextArea().setText(s);
		}
	}
	
	
	
	class updateuser implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int id=Integer.parseInt(adminpanel.getIduser().getText());
			String username=adminpanel.getUsername().getText();
			String password=adminpanel.getPass().getText();
			String tip=adminpanel.getTip().getText();
			
			User u1=new User(id, username, password, tip);
			u.update(id,u1);
		}
	}
	
	class viewusers implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			ArrayList<User> list=new ArrayList<User>();
			list=u.listUsers();
			String s="ID        Username          Password         Type"+"\n";
			panel.getFrame().setVisible(true);
			for(int i = 0; i < list.size(); i++) {   
				s=s+list.get(i).getId_user()+"    "+list.get(i).getUsername()+"   "+list.get(i).getPassword()+"    "+list.get(i).getTip()+"\n";
				
			}
			panel.getTextArea().setText(s);
			
		}
	}
	
	
	class logout implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			adminpanel.getFrame().setVisible(false);
			log.getFrame().setVisible(true);
		}
	}
	
}
