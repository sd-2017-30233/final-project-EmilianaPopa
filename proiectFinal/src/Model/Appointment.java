package Model;

public class Appointment {
	private int consultNr;
	private String doctorName;
	private String patientName;
	private String dateC;
	private String details;
	private String state;
	private int price;
	
	public Appointment(){}
	
	public Appointment(int consultNr, String doctorName, String patientName, String dateC,
			String details, String state,int price) {
		
		this.consultNr = consultNr;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.dateC = dateC;
		this.details = details;
		this.state = state;
		this.price=price;
	}
	
	public Appointment(int consultNr, String doctorName, String patientName, String dateC,
			String details, String state) {
		
		this.consultNr = consultNr;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.dateC = dateC;
		this.details = details;
		this.state = state;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	public int getConsultNr() {
		return consultNr;
	}
	public void setConsultNr(int consultNr) {
		this.consultNr = consultNr;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDateC() {
		return dateC;
	}
	public void setDateC(String dateC) {
		this.dateC = dateC;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
