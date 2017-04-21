package Ex02;

import java.util.*;

public class Launcher {
	private static int userInt;
	
    public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		userInt = Integer.parseInt(str);
		Launcher launcher = new Launcher();
		launcher.launch(userInt);
	}

	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		// Uncommenting line below will complain at compile because NullPointerError already caught
		} /* catch (NullPointerException ex) {
			ex.printStackTrace();
		} */
	}
}