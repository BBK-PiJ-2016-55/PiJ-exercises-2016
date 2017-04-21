package Ex01;

/**
* A SmartPhone makes calls, remembers 10 numbers and does www things
*/

public class SmartPhone extends MobilePhone {
	
	private String[] savedNumbers = new String[10];
	
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