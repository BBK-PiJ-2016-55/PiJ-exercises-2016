public class PhoneLauncher {
    public static void main(String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
		
	public void launch() {
	
		SmartPhone myPhone = new SmartPhone();
		
		myPhone.call("01253894851");
		myPhone.printLastNumbers();
		myPhone.ringAlarm("0630");
		myPhone.playGame("Sausages");
		myPhone.call("01253894852");
		myPhone.call("01253894853");
		myPhone.call("01253894854");
		myPhone.call("01253894855");
		myPhone.call("01253894856");
		myPhone.call("01253894857");
		myPhone.call("01253894858");
		myPhone.call("01253894859");
		myPhone.call("01253894860");
		myPhone.printLastNumbers();
		myPhone.call("01253894861");
		myPhone.printLastNumbers();
		System.out.println(myPhone.findPosition());
		myPhone.browseWeb("bbk.ac.uk");
	}
}