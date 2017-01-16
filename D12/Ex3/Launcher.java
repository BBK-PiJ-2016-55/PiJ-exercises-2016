public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	
	public void launch() {
		Person pete = new Person();
		String initials = pete.getInitials("Peter Bumbag-Smythe");
		System.out.println("Initials: " + initials);
		initials = pete.getInitials("Peter  Bumbag-Smythe");
		System.out.println("Initials: " + initials);
	}
}
		