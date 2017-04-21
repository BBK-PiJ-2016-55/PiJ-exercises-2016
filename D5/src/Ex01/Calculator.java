package Ex01;

public class Calculator {

	public int doAddition(int n1,int n2) {
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
		return result;
	}
	
	public int doSubtraction(int n1,int n2) {
		int result = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + result);
		return result;
	}
	
	public int doMultiplication(int n1,int n2) {
		int result = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + result);
		return result;
	}

	public double doDivision(int n1,int n2) {
		double d1 = (double) n1;
		double d2 = (double) n2;
		double result = d1 / d2;
		System.out.println(d1 + " / " + d2 + " = " + result);
		return result;
	}	

	public int doModulo(int n1,int n2) {
		int result = n1 % n2;
		System.out.println(n1 + " % " + n2 + " = " + result);
		return result;
	}	
}
