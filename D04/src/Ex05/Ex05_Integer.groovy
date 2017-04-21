package Ex05

class Integer2 {
int value; 

// returns the value of this number as an int, a getter.
int getValue() {
	return value
}

// Sets value of number
void setValue(int value) {
	this.value = value
}

// Returns true if number is even, false if not 
boolean isEven() {
	boolean even = true
	if ((value % 2) != 0) {
		even = false
	}
	return even
}

// Returns true if number is odd, false if not
boolean isOdd() {
	boolean odd = true
	if ((value % 2) == 0) {
		odd = false
	}
	return odd
	
}

// Prints the value of the integer on the screen
void prettyPrint() {
	println this.value
}

// Returns a String equivalent to the number
String toString() {
	String stringNumber = Integer.toString(value)
	return stringNumber
}

}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);

i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
	println "odd.";
} else {
	println "undefined!! Your code is buggy!";
}

int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}













