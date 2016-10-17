boolean asc = true
boolean desc = true
boolean finished = false
println "Please enter your first number: "
String s = System.console().readLine()
Integer n1 = Integer.parseInt(s)
println "Please enter your second number: "
s = System.console().readLine()
Integer n2 = Integer.parseInt(s)
if ((n2 == (n1 + 1))) {
	desc = false
	n1 = n2
	} else if ((n2 == (n1 - 1))) {
	asc = false
	n1 = n2
	} else {
	desc = false
	asc = false
}
while (!finished) {
	println "Please enter your next number: "
	s = System.console().readLine()
	n2 = Integer.parseInt(s)
	if (n2 == -1) {
		finished = true
	} else if ((desc) && (n2 == (n1 - 1))) {
		n1 = n2
	} else if ((asc) && (n2 == (n1 + 1))) {
		n1 = n2
	} else {
		desc = false
		asc = false
	}
}
if ((asc) || (desc)) {
	println "Yes"
} else {
	println "No"
} 