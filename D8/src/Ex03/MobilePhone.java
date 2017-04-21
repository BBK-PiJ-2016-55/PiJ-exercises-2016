package Ex03;

/**
* A MobilePhone makes calls, remembers 10 numbers and does other things.
*/

public class MobilePhone extends OldPhone {
	
	private String[] savedNumbers = new String[10];
		
	/**
	* Constructor
	*/
	public MobilePhone(String brand) {
		super(brand);
	}
	
	/**
	* Prints time alarm is set to go off
	*/
	public void ringAlarm(String time) {
		System.out.println("Alarm is set for: " + time + ".");
	}
	
	/**
	* Prints answer to a word game
	*/
	public void playGame(String game) {
		System.out.println("The word you were thinking of is: " + game + ".");
	}
	
	/**
	* Calls and logs number
	*/
	@Override
	public void call(String number){
		super.call(number);
		addNumber(number);
	}
	
	/**
	* Remembers last 10 numbers called
	*/
	public void addNumber(String newNumber){		
		for (int i = 0; i < (savedNumbers.length - 1) ; i++){
			savedNumbers[i] = savedNumbers[(i + 1)];
		}
		savedNumbers[9] = newNumber;
	}
	
	/**
	* Prints last 10 numbers called
	*/
	public void printLastNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(savedNumbers[i]);
		}
	}
}