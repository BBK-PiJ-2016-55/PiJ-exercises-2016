package Ex07;

public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
		
	public void launch() {
		
		int[] myArray = new int[5];
		myArray[0] = 2;
		myArray[1] = 23;
		myArray[2] = 234;
		myArray[3] = 2345;
		myArray[4] = 23456;
		
		
		ArrayUtilities myUtility = new ArrayUtilities();
		myUtility.toList(myArray);

	}
}