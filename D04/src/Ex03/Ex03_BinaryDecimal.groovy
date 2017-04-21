package Ex03

int power(int b, int e) {
	int total = b
	if (e == 0) {
		total = 1
	} else {
		for (i = 1; i < e; i++) {
			total = total * b
		}
	}
	return total
}

int power2(int e) {
	total = power(2,e) 
	return total
}

int binary2decimal(String binNo) {
	int total = 0
	int inputLength = binNo.length()
	for (c = 0; c < inputLength; c++){
		if (binNo.charAt(c) == "1"){
		total = total + power2((inputLength - 1) - c)
		}
	} 
	return total
}

String decimal2binary(int decNo) { 
	String resultString = ""
	while (decNo != 0) {
		resultString = resultString + (decNo % 2)
		decNo = (decNo / 2)
	}
	String reverseResultString = ""
	int stringLength = resultString.length()
	for (c = (stringLength - 1); c >= 0; c--){
		reverseResultString = reverseResultString + resultString.charAt(c)
	}
	return reverseResultString
}

println "Enter 1 to convert binary to decimal."
println "Enter 2 to convert decimal to binary."
String str = System.console().readLine();
int choice = Integer.parseInt(str)
if (choice == 1) {
	println "Enter binary number: "
	str = System.console().readLine();
	int decimalResult = binary2decimal(str)
	println decimalResult
} else if (choice == 2) {
	println "Enter decimal number: "
	str = System.console().readLine();
	int decNo = Integer.parseInt(str)
	String binaryResult = decimal2binary(decNo)
	println binaryResult
} else {
	println "Invalid input, try again."
}
