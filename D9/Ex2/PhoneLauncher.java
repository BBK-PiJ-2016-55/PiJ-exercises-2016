public class PhoneLauncher {
    private static MobilePhone myPhone;

    public static void main(String[] args){
		makePhone();
	}

	public static void makePhone() {
		SmartPhone myPhone = new SmartPhone("Nokia");	
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
		myPhone.browseWeb("someaddress.com");
		System.out.println(myPhone.findPosition());
		testPhone(myPhone);
	}

	// 2.3 - will only run methods defined in Phone: call()
	// 2.4 - Unless downcast to SmartPhone
	public static void testPhone(Phone phone) {
		SmartPhone smartphone = (SmartPhone) phone;
		smartphone.call("01253894951");
		smartphone.playGame("Merkin");
		smartphone.browseWeb("someotheraddress.com");
		// phone.ringAlarm("0630");
		// phone.printLastNumbers();

	}



}