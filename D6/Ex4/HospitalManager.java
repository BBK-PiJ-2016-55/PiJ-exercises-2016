public class HospitalManager {
	private Patient firstPatient = null;
	public static int noPatients = 0;
	
	// Add new patient after checking if list is empty
	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
				firstPatient = newPatient;
				firstPatient.setNextPatient(firstPatient);
				noPatients++;
				return;
			}
		
		Patient current = firstPatient;
		// Move to the end of the list if not there already
		while (current.getNextPatient() != firstPatient ) {
			current = current.getNextPatient();
		} 
		current.setNextPatient(newPatient);
		// Move to new end of the list and point to firstPatient to close the circle
		current = current.getNextPatient();
		current.setNextPatient(firstPatient);		
		noPatients++;
		
	}
	
	// Return number of current patients
	public void getNoPatients() {
		System.out.println("");
		System.out.println("Number of patients: " + this.noPatients);
	}
	
	// Print list of current patients
	public void printPatients() {
		System.out.println("Current patient list: ");
		Patient current = firstPatient;
		do {
			String name = current.getPatientName();
			System.out.println(name);
			current = current.getNextPatient();
		} while (current != firstPatient);
	}
	
	// Delete patients
	public boolean deletePatient(String name) {
		// Check if list is empty - nothing to remove
		if (firstPatient == null) {
			return false;
		} 
		
		// Check if patient to be deleted is first in list
		if (firstPatient.getPatientName().equals(name)) {
			if (firstPatient.getNextPatient() == firstPatient) {
				firstPatient = null;
			} else {
				// Find last patient and change nextPatient to point to firstPatient-in-waiting
				Patient current = firstPatient;
				while (current.getNextPatient() != firstPatient) {
					current = current.getNextPatient();
					}
				current.setNextPatient(current.getNextPatient().getNextPatient()); 
				firstPatient = firstPatient.getNextPatient();
			}
			noPatients--;
			return true;
		}
	
		Patient current = firstPatient;
		while (current.getNextPatient() != firstPatient) {
			// Go through list, checking if the name of the *next* patient is the one to be deleted
			if (current.getNextPatient().getPatientName().equals(name)) {
				// If it is, set current NextPatient to point to Patient after next
				current.setNextPatient(current.getNextPatient().getNextPatient());
				noPatients--;
				return true;
			} else {
				current = current.getNextPatient();
			}
		
		}
		// Return false if no matching name found in list
		return false;
		
	}
}
