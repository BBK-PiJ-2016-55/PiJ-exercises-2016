public class Doggy {
	
	public static void main(String[] args) {
		Doggy myDoggy = new Doggy();
		System.out.println(myDoggy.doggyMethod(5));
	}
	
	String doggyMethod(int n) {
		// Need to move base case to the top of method in order to avoid infinite recursion
		if (n <= 0) {
				return "";
		}
		String result = doggyMethod(n - 3) + n + doggyMethod(n - 2);
		return result;
	}
}