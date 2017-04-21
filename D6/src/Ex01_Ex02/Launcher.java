package Ex01_Ex02;

public class Launcher {
    public static void main(String[] args){
   
		HospitalManager myHospital = new HospitalManager();
		
		Patient patientOne = new Patient("Doris", 45, "Angina");
		myHospital.addPatient(patientOne);
		
		Patient patientTwo = new Patient("Malcolm", 15, "Broken arm");
		myHospital.addPatient(patientTwo);
		
		Patient patientThree = new Patient("Ray", 20, "Burns");
		myHospital.addPatient(patientThree);
		
		Patient patientFour = new Patient("Sandy", 33, "Shark attack");
		myHospital.addPatient(patientFour);
		
		Patient patientFive = new Patient("Theresa", 33, "Ear infection");
		myHospital.addPatient(patientFive);
		
		Patient patientSix = new Patient("Viv", 27, "Broken leg");
		myHospital.addPatient(patientSix);
		
		Patient patientSeven = new Patient("Joey", 29, "Pericaritis");
		myHospital.addPatient(patientSeven);
		
		Patient patientEight = new Patient("Roberta", 56, "Heart attack");
		myHospital.addPatient(patientEight);
		
		Patient patientNine = new Patient("Sylvia", 102, "Chemical burns");
		myHospital.addPatient(patientNine);
		
		Patient patientTen = new Patient("Juri", 45, "Angina");
		myHospital.addPatient(patientTen);
		
		//  Print list of patients
		myHospital.printPatients();
		
		// Print total number  of patients - should be 10 at this point
		myHospital.getNoPatients();
		
		
		// Delete patient
		boolean deleted = myHospital.deletePatient("Doris");
		if (deleted) {
			System.out.println("Patient has been deleted");
		} else {
			System.out.println("Could not find matching patient");
		}
		
		//  Print list of patients (should be missing Doris)
		System.out.println("");
		myHospital.printPatients();
		
		// Print total number  of patients - should be 9 at this point
		myHospital.getNoPatients();
			
	}
}