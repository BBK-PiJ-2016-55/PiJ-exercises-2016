public class HospitalManager {
	private Patient firstPatient = null;
	
	// adds new patient, after checking if list is empty
	public void addPatient(Patient newPatient) {
		if (firstPatient == null) {
				firstPatient = newPatient;
				return;
			}
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPatient();
		} 
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);	
}
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			//list is empty nothing to remove
			return false;
		} 
		if (firstPatient.getPatientName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			return true;
		}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
				if (current.getNextPatient().getPatientName().equals(name)) {
					current.setNextPatient(current.getNextPatient().getNextPatient());
					return true;
				}
					
			
		}
		
		return false;
		
	}
}
