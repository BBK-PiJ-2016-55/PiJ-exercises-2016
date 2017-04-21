package Ex02;

public class Launcher {
    public static void main(String[] args){
        int[] testArray = new int[5];
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;
		testArray[3] = 2;
		testArray[4] = 1;

        ArrayChecker myChecker = new ArrayChecker();
		boolean symTest = myChecker.isSymmetrical(testArray);
		
        if(symTest) {
			System.out.println("Symmetrical: ");
		} else {
			System.out.println("Not symmetrical: ");
		}
		for (int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i]);
		}
		
		int[] testArrayTwo = new int[5];
        testArrayTwo[0] = 1;
        testArrayTwo[1] = 2;
        testArrayTwo[2] = 3;
		testArrayTwo[3] = 4;
		testArrayTwo[4] = 5;
		
		int[] reverseArray = new int[5];
		reverseArray = myChecker.reverse(testArrayTwo);
		System.out.println("");
		System.out.println("Reversed array: ");
		
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.println(reverseArray[i]);
		}
		
    }
}