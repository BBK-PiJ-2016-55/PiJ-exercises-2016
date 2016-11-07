public class Launcher {
    public static void main(String[] args){
   
		HospitalManager myHospital = new HospitalManager();
		
		Patient firstPatient = new Patient("Doris", 45, "Angina");
		Patient secondPatient = new Patient("Malcolm", 15, "Broken arm");
		Patient thirdPatient = new Patient("Ray", 20, "Burns");
		
		myHospital.addPatient(firstPatient);
		myHospital.addPatient(secondPatient);
		myHospital.addPatient(thirdPatient);
		
		Patient traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
			
		Patient fourthPatient = new Patient("Sandy", 33, "Shark attack");
		myHospital.addPatient(fourthPatient);
		
		traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
		
		boolean deleted = myHospital.deletePatient("Malcolm");
		
		System.out.println(deleted);
		
		traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
		
		
   }
}