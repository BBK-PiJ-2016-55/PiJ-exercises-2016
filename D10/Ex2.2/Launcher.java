import java.util.*;

public class Launcher {
	private static int userInt;
	
    public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		userInt = scanner.nextInt();
		Fibonacci myFibonacci = new Fibonacci();
		System.out.println("Recursive: " + myFibonacci.recursiveFibonacci(userInt));

		System.out.println("Enter a number: ");
		userInt = scanner.nextInt();
		System.out.println("Iterative " + myFibonacci.iterativeFibonacci(userInt));
	}
}
