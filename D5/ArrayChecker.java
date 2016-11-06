public class ArrayChecker {
	
	// Returns true if the array of int provided as argument is symmetrical
	public boolean isSymmetrical(int[] myArray) {
		int rightCount = (myArray.length - 1);
		
		for (int i = 0; i <= (rightCount / 2); i++) {
			if (myArray[rightCount] != myArray[i]) {
				return false;
			} else {
				rightCount--;
			}
		}
		
	return true;
	}
	
	// Takes array and returns in reverse order
	public int[] reverse(int[] myArray) {
		int arraySize = (myArray.length - 1);
		int[] reverseArray = new int[myArray.length];
		for (int i = 0; i <= arraySize; i++) {
			reverseArray[i] = myArray[arraySize - i];
		}
		return reverseArray;
	}	
	
	
	
}