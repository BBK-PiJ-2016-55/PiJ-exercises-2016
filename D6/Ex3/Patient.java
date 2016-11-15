public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
	
	public void setNextPatient(Patient newPatient) {
		this.nextPatient = newPatient;	
	}
	
	public void setPreviousPatient(Patient newPatient) {
		this.previousPatient = newPatient;	
	}

	public String getPatientName() {
		return this.name;
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;	
	}
	
	public Patient getPreviousPatient() {
		return this.previousPatient;	
	}
	
}