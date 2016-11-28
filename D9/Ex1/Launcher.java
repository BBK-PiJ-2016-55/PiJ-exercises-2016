public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
		
	public void launch() {
		
		Comparator myComparator = new Comparator();
		System.out.println(myComparator.getMax("5","2"));
		System.out.println(myComparator.getMax(5,2));
		System.out.println(myComparator.getMax(5.0,2.0));
	}
}