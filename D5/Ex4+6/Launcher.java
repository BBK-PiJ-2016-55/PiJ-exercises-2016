public class Launcher {
    public static void main(String[] args){
        
		Matrix myMatrix = new Matrix(5,5);
		myMatrix.setElement(1,2,4);
		myMatrix.setColumn(4, "8,8,8,8,8");
		myMatrix.setRow(3, "9,8,7,8,9");
		String str = myMatrix.toString();
		myMatrix.prettyPrint();
		myMatrix.checkSymmetry(3);
		
		myMatrix.setRow(0, "1,2,3,4,8");
		myMatrix.setRow(1, "2,1,5,6,9");
		myMatrix.setRow(2, "3,5,1,7,10");
		myMatrix.setRow(3, "4,6,7,1,11");
		myMatrix.setRow(4, "8,9,10,11,1");
		myMatrix.prettyPrint();
		myMatrix.checkBiSymmetry();
		
		myMatrix.setRow(0, "1,0,0,0,0");
		myMatrix.setRow(1, "2,3,0,0,0");
		myMatrix.setRow(2, "4,5,6,0,0");
		myMatrix.setRow(3, "7,8,9,1,0");
		myMatrix.setRow(4, "2,3,4,5,6");
		myMatrix.prettyPrint();
		myMatrix.checkTriangular();
		
		}
		
    }