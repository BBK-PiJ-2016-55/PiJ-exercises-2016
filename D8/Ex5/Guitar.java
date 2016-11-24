/**
* A Guitar plays and burns
*/

public class Guitar{
	private WoodenObject woodenobject = new WoodenObject();
	private MusicalInstrument musicalinstrument = new MusicalInstrument();
	
	public void burn(String object){
		woodenobject.burn(object);
	}
	
	public void play(String song){
		musicalinstrument.play(song);
	}
}