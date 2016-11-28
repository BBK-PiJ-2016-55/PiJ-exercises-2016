public class PhoneLauncher {
    public static void main(String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
		
	public void launch() {
	
		MobilePhone myPhone = new SmartPhone("Motorola");
		
		myPhone.call("01253894851");
		myPhone.call("01253894852");
		myPhone.call("01253894853");
		myPhone.call("01253894854");
		myPhone.call("01253894855");
		myPhone.call("01253894856");
		myPhone.call("01253894857");
		myPhone.call("01253894858");
		myPhone.call("01253894859");
		myPhone.call("01253894860");
		myPhone.call("01253894861");
		myPhone.call("00253894861");
		myPhone.printLastNumbers();
		myPhone.ringAlarm("0630");
		myPhone.playGame("Sausages");
		testPhone();
		
	}
	
	public void testPhone() {
	
		MobilePhone myPhone = new SmartPhone("Motorola");
		SmartPhone mySmartPhone = (SmartPhone) myPhone; 
		
		myPhone.call("01253894851");
		myPhone.call("01253894852");
		myPhone.call("01253894853");
		myPhone.call("01253894854");
		myPhone.call("01253894855");
		myPhone.call("01253894856");
		myPhone.call("01253894857");
		myPhone.call("01253894858");
		myPhone.call("01253894859");
		myPhone.call("01253894860");
		myPhone.call("01253894861");
		myPhone.call("00253894861");
		myPhone.printLastNumbers();
		myPhone.ringAlarm("1030");
		myPhone.playGame("Patchouli");
		mySmartPhone.browseWeb("someaddress.com");
		System.out.println(mySmartPhone.findPosition());
		
		
	}

}