package Ex01;

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
			// Line below will cause exception on input '6'
			System.out.println(intList.get(userInput));
			intList.remove(0);
			// Line below will cause exception on input '4'
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			// Line below will cause exception on input '2'
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			// Line below will cause exception on input '0'
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
}
