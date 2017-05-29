package Model;

public class Patient {
	private String CNP;
	private String nume;
	private String address;
	private String dateOfBirth;

	
	public Patient(){}
	
	public Patient(String cNP, String nume, String address, String dateOfBirth) {
		CNP = cNP;
		this.nume = nume;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
	
}
