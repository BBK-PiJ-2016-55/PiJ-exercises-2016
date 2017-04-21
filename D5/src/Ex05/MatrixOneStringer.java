package Ex05;

public class MatrixOneStringer extends Matrix  {
	private int[][] twoArrays; 

	
	public MatrixOneStringer(int rows, int columns) {
		super(rows, columns);
	} 
	
	// Creates Matrix from a single input string in format "n,n,n;n,n,n"
	public void setMatrix(String newValues) {
		// Delimits rows and places into new array
		String[] inputString = newValues.split(";");
		// Feeds through to setRow()
		for (int i = 0; i < inputString.length; i++) {
			this.setRow(i, inputString[i]);
		}
	}	
}



















