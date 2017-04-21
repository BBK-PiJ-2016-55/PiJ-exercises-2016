package Ex07;/* NewString won't compile - cannot inherit from final String */

public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
		
	public void launch() {
		
		NewString myNewString = new NewString();
		myNewString.printEven("Penguin");	
	}
}