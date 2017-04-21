package Ex02_1;

public class Factorial {
	
	public int recursiveFactorial(int n) {
		if (n == 1) {
			return 1; 
		} else {
			int result = n * recursiveFactorial(n - 1);
			return result;
		}
	}

	public int iterativeFactorial(int n) {
		int result = n;
		for (int i = 1; i < n; i++) {
			result = result * (n - i);
		}
		return result;
	}

}