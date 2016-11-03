int power(int b, int e) {
	int total = b
	for (i = 1; i < e; i++) {
		total = total * b
	}
	return total
}

println "Enter your base: "
String str = System.console().readLine();
int b = Integer.parseInt(str);
println "Enter your exponent: "
str = System.console().readLine();
int e = Integer.parseInt(str);
int result = power(b,e)
println result


