package Ex04_Ex06;

public class MatrixChecker {
	
	public boolean isSymmetrical(int[] myArray) {
		boolean symmetrical = true;
		int back = (myArray.length - 1);
		
		for (int i = 0; i < (myArray.length / 2); i++) {
			if (myArray[i] != myArray[back - i]) {
				symmetrical = false;	
			}
			
		}
		return symmetrical;
	}
	
	public boolean isBiSymmetrical(int[][] myDoubleArray) {
		boolean symmetrical = true;
		if (myDoubleArray.length != myDoubleArray[0].length){
			symmetrical = false;
		} else {
			for (int i = 0; i < myDoubleArray.length; i++) {
				for (int j = 0; j < myDoubleArray.length; j++) {
					if (myDoubleArray[i][j] != myDoubleArray[j][i]) {
						symmetrical = false;
					}
				}
			}		
		}
		return symmetrical;
	}
	
	public boolean isTriangular(int[][] myDoubleArray) {
		boolean symmetrical = true;
		for (int i = 0; i < myDoubleArray.length; i++) {
			for (int j = 0; j < myDoubleArray.length; j++) {
				if ((i > j) && myDoubleArray[i][j] != 0) {
					symmetrical = false;
				}
			}
		}
		return symmetrical;
	}
	
	
}