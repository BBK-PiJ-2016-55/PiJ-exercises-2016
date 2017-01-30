public class McCarthy {
	static int counter = 0;
	
	public static void main(String[] args) {	
		McCarthy myMcCarthy = new McCarthy();
		System.out.println(myMcCarthy.mcCarthy91(52));
	}
	// Returns 91 for n <= 100
	public int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}

	}