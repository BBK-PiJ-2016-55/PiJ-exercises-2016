package D1

Integer min, med, max
println "Please enter your first number: "
String s = System.console().readLine()
Integer n1 = Integer.parseInt(s)
println "Please enter your second number: "
s = System.console().readLine()
Integer n2 = Integer.parseInt(s)
println "Please enter your third number: "
s = System.console().readLine()
Integer n3 = Integer.parseInt(s)
if (n3 < n2) {
	if (n2 < n1) {
		min = n3
		max = n1
		med = n2
	} else if (n1 < n3) {
		min = n1
		med = n3
		max = n2
	} else {
		min = n3
		med = n1
		max = n2
	}
} else if (n2 > n1) {
	min = n1
	med = n2
	max = n3
} else { 
	min = n2
	if (n3 > n1) {
	med = n1
	max = n3
	} else {
	med = n3
	max = n1
	}
}
println min + ", " + med + ", " + max











