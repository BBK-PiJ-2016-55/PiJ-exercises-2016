package Ex03;

/**
* A SmartPhone makes calls, remembers 10 numbers and does www things
*/

public class SmartPhone extends MobilePhone {
	
	private String[] savedNumbers = new String[10];
		
	/**
	* Constructor
	*/
	public SmartPhone(String brand) {
		super(brand);
	}
	
	/**
	* Calls and logs number
	*/
	@Override
	public void call(String number){
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money");
			super.addNumber(number);	
		} else {
			super.call(number);
		}
	}
	
	/**
	* Prints current url
	*/
	public void browseWeb(String url){
		System.out.println(url);
	}
	
	/**
	* Returns current GPS co-ordinates
	*/
	public String findPosition(){
		double x = Math.random() * 10;
		double y = Math.random() * 10;
		String coordinates = x + ", " + y;
		return coordinates;
	}
	
	
	
	
	
}