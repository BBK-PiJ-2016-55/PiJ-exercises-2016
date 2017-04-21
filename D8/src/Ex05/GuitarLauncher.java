package Ex05;

public class GuitarLauncher {
    public static void main(String[] args){
		GuitarLauncher launcher = new GuitarLauncher();
		launcher.launch();
	}
		
	public void launch() {
		
		Guitar myGuitar = new Guitar();
		myGuitar.burn("Guitar");
		myGuitar.play("Relight my fire");
		
	}
}