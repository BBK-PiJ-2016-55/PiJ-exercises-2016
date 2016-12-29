public class PlaneGame {
	public static void main(String[] args){
		PlaneGame game = new PlaneGame();
		game.launch();
	}

	public void launch() {
		boolean playAgain = false;

		do {
		boolean finished = false;
		playAgain = false;
		Target WarIsHell = new Target(5);
		WarIsHell.init();
		System.out.println("Incoming! Try to bring the plane down!");
		// Prompt user for coordinates until they score a hit
		while (!finished) {
			System.out.println("Enter an X coordinate: ");
			String str = System.console().readLine();
			int x = Integer.parseInt(str);
			System.out.println("Enter a Y coordinate: ");
			str = System.console().readLine();
			int y = Integer.parseInt(str);
			System.out.println("Enter a Z coordinate: ");
			str = System.console().readLine();
			int z = Integer.parseInt(str);
			Result myResult = WarIsHell.fire(x,y,z);
			
			// Respond with result and option to continue if successful
			switch (myResult) {
				case OUT_OF_RANGE:
					System.out.println("That shot is way out of range! Try harder!");
					break;
				case HIT:
					System.out.println("A hit! Nice shot!");
					finished = true;
					System.out.println("Would you like to play again?");
					str = System.console().readLine();
					if (str.equals("y") || str.equals("Y")) {
						playAgain = true;							
					} 
					break;
				case FAIL_LEFT:
					System.out.println("You missed! The target is to the left.");
					break;
				case FAIL_RIGHT:
					System.out.println("You missed! The target is to the right.");
					break;
				case FAIL_HIGH:
					System.out.println("You missed! The target is higher.");
					break;
				case FAIL_LOW:
					System.out.println("You missed! The target is lower.");
					break;
				case FAIL_SHORT:
					System.out.println("You missed! The target is nearer.");
					break;
				case FAIL_LONG:
					System.out.println("You missed! The target is further away.");
					break;
				default:
					System.out.println("Error - default case");
					break;

				}
			}
		} while (playAgain);
	}

}