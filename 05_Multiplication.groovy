Integer i = 1
Integer p = 0
println "Please enter your first number: "
String s = System.console().readLine()
Integer n1 = Integer.parseInt(s)
println "Please enter your second number: "
s = System.console().readLine()
Integer n2 = Integer.parseInt(s)
	while (i > n2) {
		p = p + n1
		i++
	}
println "The product of " + n1 + " and " + n2 + " is " + p
