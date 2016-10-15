Integer i = 2
println "Please enter a number: "
String s = System.console().readLine()
Integer n = Integer.parseInt(s)
boolean finished = false
boolean prime = true 
	while (!finished) {
		if ((i == (n - 1)) || ((n < 4) && (n > 0))) {
			finished = true
			} else {			
			if ((n % i) == 0) {
				finished = true
				prime = false
				} else {
				i++
				}
			}
		}

if (!prime) {
	println "The number " + n + " is not Prime"
	} else {
	println "The number " + n + " is Prime"
}