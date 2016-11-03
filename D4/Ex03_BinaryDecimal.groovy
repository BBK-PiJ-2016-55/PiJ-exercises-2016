int power(int b, int e) {
	int total = b
	for (i = 1; i < e; i++) {
		total = total * b
	}
	return total
}

int power2(int e) {
	total = power(2,e) 
	return total
}

int binary2decimal(String binNo) {
	int total = 0
	for (c = 0; c < binNo.length(); c++){
		if (binNo.charAt(c) == "1"){
		total = total + power2((binNo.length() - 1) - c)
		}
		 	
	} 
	return total
}

println "Enter your binary number: "
String str = System.console().readLine();
int result = binary2decimal(str)
println result
