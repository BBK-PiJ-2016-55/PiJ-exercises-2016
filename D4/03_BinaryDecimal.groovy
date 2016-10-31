power()

int power(int, int) {
	println "Enter your base: "
	String str = System.console().readLine();
	double base = Integer.parseInt(str);
	println "Enter your exponent: "
	str = System.console().readLine();
	double exponent = Integer.parseInt(str);
	double result = Math.pow(base, exponent);
	println result;
	return result
} 

println result;