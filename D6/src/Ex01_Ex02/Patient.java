package Ex01_Ex02;

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public void setNextPatient(Patient newPatient) {
		this.nextPatient = newPatient;	
	}

	public String getPatientName() {
		return this.name;
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;	
	}
	
}