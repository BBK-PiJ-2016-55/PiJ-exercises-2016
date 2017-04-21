package D1

boolean ascon = true
boolean finished = false
println "Please enter your first number: "
String s = System.console().readLine()
Integer n1 = Integer.parseInt(s)
	while (!finished) {
		println "Please enter another number: "
		s = System.console().readLine()
		n2 = Integer.parseInt(s)
		if (n2 == -1) {
			finished = true
		} else if ((n2 == (n1 + 1)) && (ascon)) {
			n1 = n2
		} else {
			ascon = false
		}
	}
if (ascon) {
	println "Yes"
} else {
	println "No"
}
