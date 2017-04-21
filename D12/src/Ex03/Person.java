package Ex03;

public class Person {
	public String getInitials(String fullName) {
		String result = "";
		// delimiter changed to regex to fix multiple space bug
		String[] words = fullName.split(" +");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
}