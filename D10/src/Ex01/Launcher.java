package Ex01;

public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
		
	public void launch() {
		
		RecursionTest myRecursionTest = new RecursionTest();
		myRecursionTest.printNumbers(6);
	}
}