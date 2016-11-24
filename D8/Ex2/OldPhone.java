/**
* A OldPhone makes calls
*/

public class OldPhone implements Phone {
	
	private String brand = null;
	
	/**
	* Prints number
	*/
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}
	
}

