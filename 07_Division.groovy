Integer i = 0
Integer r = 0
Integer total = 0

println "Please enter your first number: "
String s = System.console().readLine()
Integer n1 = Integer.parseInt(s)
println "Please enter your second number: "
s = System.console().readLine()
Integer n2 = Integer.parseInt(s)

if (n2 > n1) {
	println n1 + " does not divide by " + n2
	} else {
		while (total < n1) {
		total = total + n2
		i++
		}
	if (total == n1) {
		r = 0
		} else {
		r = n1 - (total - n2)
		i = i - 1
		}
	println n1 + " divided by " + n2 + " is " + i + " remainder " + r + "."
	}

