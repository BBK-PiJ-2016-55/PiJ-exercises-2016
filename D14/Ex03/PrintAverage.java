import java.util.*;

public class PrintAverage {
	private int userInt;
	private int total = 0;
	
	public static void main(String[] args){
		PrintAverage pa = new PrintAverage();
		pa.getAverage();
	}
	
	public void getAverage() {
		for (int i = 0; i < 10; i++) {
			int n = requestNumber();
			total = total + n; 
		}
		int ave = (total / 10);
		System.out.println("Average of ten number input is: " + ave);
	}
	
	public int requestNumber() {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		try {
			String str = scanner.nextLine();
			userInt = Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			System.out.println("You didn't enter a number!");
			requestNumber();
		} finally {
		return userInt;
		}
	}
	
	
}