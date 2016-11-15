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
		newPatient.setPreviousPatient(current);
		noPatients++;
		
	}
	
	// Return number of current patients (length of list)
	public void getNoPatients() {
		System.out.println("");
		System.out.println("Number of patients: " + this.noPatients);
	}
	
	// Print list of current patients from first to last
	public void printPatientsForward() {
		Patient current = firstPatient;
		while (current != null) {
			String name = current.getPatientName();
			System.out.println(name);
			current = current.getNextPatient();
		}
	}

	// Print list of current patients from last to first
	public void printPatientsBackward() {
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
			// Should finish while loop when current = last patient in list
		}
		while (current != null) {
			String name = current.getPatientName();
			System.out.println(name);
			current = current.getPreviousPatient();
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
			firstPatient.setPreviousPatient(null);
			noPatients--;
			return true;
		}
		
		Patient current = firstPatient;
			while (current.getNextPatient() != null) {
					// Go through list, checking if the name of the *next* patient is the one to be deleted
					if (current.getNextPatient().getPatientName().equals(name)) {
						// If it is, set current NextPatient to point to Patient after next
						current.setNextPatient(current.getNextPatient().getNextPatient());
						// Set current to patient after deleted patient
						current = current.getNextPatient();
						// set current PreviousPatient to point to patient before last (before deleted patient)
						current.setPreviousPatient(current.getPreviousPatient().getPreviousPatient());
						noPatients--;
						return true;
					}
			
			}
		// Return false if no matching name found in list
		return false;
		
	}
}
