package Ex03;

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
	
	/**
	* Constructor
	*/
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	/**
	* Getter
	*/
	public String getBrand() {
		return brand;
}

	
	
}

