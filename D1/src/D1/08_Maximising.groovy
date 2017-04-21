package D1

boolean finished = false
println "Please enter your first number: "
String s = System.console().readLine()
Integer n = Integer.parseInt(s)
Integer max = n
	while (!finished) {
		println "Please enter another number: "
		s = System.console().readLine()
		n = Integer.parseInt(s)
		if (n == -1) {
			finished = true
		} else if (n > max) {
			max = n
		}
	}
println "Largest number is: " + max










