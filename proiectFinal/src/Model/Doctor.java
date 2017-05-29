package Model;

public class Doctor {
	private int id_doc;
	private String nume;
	private String address;
	private String specializare;

	
	public Doctor(){}
	
	public Doctor(int id_doc, String nume, String address, String specializare) {
		
		this.id_doc = id_doc;
		this.nume = nume;
		this.address = address;
		this.specializare = specializare;
		
	}
	public int getId_doc() {
		return id_doc;
	}
	public void setId_doc(int id_doc) {
		this.id_doc = id_doc;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpecializare() {
		return specializare;
	}
	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

}
