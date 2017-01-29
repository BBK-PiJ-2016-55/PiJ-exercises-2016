public class Fibonacci {
	
	public int recursiveFibonacci(int n) {
		if ((n == 1) || (n == 2)) {
        	return 1;
        } else {
			int result = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
            return result;
        }
	}

	public int iterativeFibonacci(int n) {
		if ((n == 1) || (n == 2)) {
        	return 1;
        } else {
		int result = 0;
		int lastFib1 = 1;
		int lastFib2 = 1;
		for (int i = 3; i <= n; i++) {
			result = lastFib1 + lastFib2;
			lastFib1 = lastFib2;
			lastFib2 = result;
		}
		return result;
		}
	}
}