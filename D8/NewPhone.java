public class NewPhone extends OldPhone {
	
	private String[] savedNumbers;
	
	public NewPhone(){
		String savedNumbers[] = new String[10];
	}
		
	// print alarm time
	public void ringAlarm(String time) {
		System.out.println("Alarm is set for: " + time + ".");
	}
	
	// print wordgame
	public void playGame(String game) {
		System.out.println("The word you were thinking of is: " + game + ".");
	}
	
	// print number calling	
	public void call(String number){
		super.call(number);
		addNumber(number);
	}
	
	public void addNumber(String newNumber){
		// Check for free space in last 10 dialled array
		for (int i = 0; i <= 10; i++) {
			if (savedNumbers[i] == null) {
				savedNumbers[i] = newNumber;
				return;
			}
		}
		
		// If there's no free space, make a new array and assign first 9 + new 1 
		String[] newArray = new String[10];
		newArray[0] = newNumber;
		for (int i = 1; i < 10; i++){
			newArray[i] = savedNumbers[(i - 1)];
			savedNumbers = newArray;
		}	
					
	}
	
	

	
	
	
	
}