package Ex6;

public class LecturerLauncher {
    public static void main(String[] args){
		LecturerLauncher launcher = new LecturerLauncher();
		launcher.launch();
	}
		
	public void launch() {
		
		Lecturer myLecturer = new Lecturer();
		myLecturer.teach("Biology");
	    myLecturer.doResearch("Elephants");
		
	}
}