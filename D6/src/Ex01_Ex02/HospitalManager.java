package Ex01_Ex02;

public class HospitalManager {
	private Patient firstPatient = null;
	public static int noPatients = 0;
	
	// adds new patient, after checking if list is empty
	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
				firstPatient = newPatient;
				noPatients++;
				return;
			}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPatient();
		} 
		// After the while loop completes, current = the last patient
		// Adds newPatient to the end of the list
		current.setNextPatient(newPatient);	
		noPatients++;
		
	}
	
	// Return number of current patients (length of list)
	public void getNoPatients() {
		System.out.println("");
		System.out.println("Number of patients: " + this.noPatients);
	}
	
	// Print list of current patients
	public void printPatients() {
		Patient current = firstPatient;
		while (current != null) {
			String name = current.getPatientName();
			System.out.println(name);
			current = current.getNextPatient();
		}
	}
	
	// Delete patients
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			// Check if list is empty - nothing to remove
			return false;
		} 
		
		if (firstPatient.getPatientName().equals(name)) {
			// Check if patient to be deleted is first in list
			firstPatient = firstPatient.getNextPatient();
			noPatients--;
			return true;
		}
		
		Patient current = firstPatient;
			while (current.getNextPatient() != null) {
					// Go through list, checking if the name of the *next* patient is the one to be deleted
					if (current.getNextPatient().getPatientName().equals(name)) {
						// If it is, set current NextPatient to point to Patient after next
						current.setNextPatient(current.getNextPatient().getNextPatient());
						noPatients--;
						return true;
					}
			
			}
		// Return false if no matching name found in list
		return false;
		
	}
}
