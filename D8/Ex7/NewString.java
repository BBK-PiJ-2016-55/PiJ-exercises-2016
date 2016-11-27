/* Won't compile - cannot inherit from final String */ 

public class NewString extends String {

	public void printEven(String string){
		for (int i = 0; i < string.length(); i++) {
				if ((i % 2) == 0) {
					System.out.println(charAt(i));
				}	
		}
	}
}