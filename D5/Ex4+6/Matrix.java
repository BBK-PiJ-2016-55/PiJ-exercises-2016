public class Matrix {
	private int[][] twoArrays; 

	// Constructor - takes two ints to define number of elements in each row array and each column array
	public Matrix(int rows, int columns) { 
			
			this.twoArrays = new int[rows][columns];
		
			// Assign every element value of 1
			for (int i = 0; i < this.twoArrays.length; i++) {
				for (int j = 0; j < this.twoArrays[i].length; j++) {
					this.twoArrays[i][j] = 1;
				}
			}
		}
	
	// Changes the value of a single element, after checking indices are valid	
	public void setElement(int row, int column, int newValue) {
		if (row < this.twoArrays.length && column < this.twoArrays[row].length) {
			this.twoArrays[row][column] = newValue;
		}
	}

	// Changes the value of a row to the values defined in input string	
	public void setRow(int row, String newValues) {
		// Delimits string and place in new array
		String[] inputStr = newValues.split(",");
		// Validates indices and length of input against array
		if (row < this.twoArrays[0].length && inputStr.length == (this.twoArrays.length)) {
			for (int i = 0; i < this.twoArrays.length; i++) {
			this.twoArrays[i][row] =  Integer.parseInt(inputStr[i]);
			}
		}
	}
	
	// Changes the value of a column to the values defined in input string	
	public void setColumn(int column, String newValues) {
		// Delimits string and place in new array
		String[] inputStr = newValues.split(",");
		// Validates indices and length of input against array
		if (column < this.twoArrays.length && inputStr.length == this.twoArrays[column].length) {
			for (int i = 0; i < this.twoArrays[column].length; i++) {
				this.twoArrays[column][i] =  Integer.parseInt(inputStr[i]);
			}
		}
	}
	
	// Returns values as a string in the format [n,n,n;n,n,n]
	public String toString() {
		String result = "[";
		
		for (int i = 0; i < this.twoArrays.length; i++) {
				for (int j = 0; j < this.twoArrays[i].length; j++) {
					result = result + this.twoArrays[i][j];
					// Delimit rows with , except last one
					if (j != this.twoArrays[i].length -1) {
						result = result + ",";
					}
				}
				// Delimit columns with ;, except last one
				if (i != this.twoArrays.length -1) {
					result = result + ";";
				}
			}	
		result = result + "]";
		return result;
		
	}
	
	// Prints out all elements in the matrix as a grid
	public void prettyPrint() {
		
		for (int i = 0; i < this.twoArrays[0].length; i++) {
			for (int j = 0; j < this.twoArrays.length; j++) {
				System.out.print(this.twoArrays[j][i] + "\t");
			}
		System.out.println("");
		}
	}
		
	// Takes row from matrix and checks if symmetrical
	public void checkSymmetry(int row) {
		MatrixChecker myMatrixChecker = new MatrixChecker();
		
		int[] singleArray = new int [this.twoArrays.length];
		for (int i =0; i < this.twoArrays.length; i++) {
			singleArray[i] = this.twoArrays[i][row];
		}
		if (myMatrixChecker.isSymmetrical(singleArray)) {
			System.out.println("Row number " + row + " is symmetrical.");
		} else {
			System.out.println("Row number " + row + " is not symmetrical.");
		}
	}		

	public void checkBiSymmetry() {
		MatrixChecker myMatrixChecker = new MatrixChecker();
		
		if (myMatrixChecker.isBiSymmetrical(this.twoArrays)) {
			System.out.println("Your double array is symmetrical.");
		} else {
			System.out.println("Your double array is not symmetrical.");
		}
	}		
		
	public void checkTriangular() {
		MatrixChecker myMatrixChecker = new MatrixChecker();
		
		if (myMatrixChecker.isTriangular(this.twoArrays)) {
			System.out.println("Your double array is triangular.");
		} else {
			System.out.println("Your double array is not triangular.");
		}
	}			
		
}




















