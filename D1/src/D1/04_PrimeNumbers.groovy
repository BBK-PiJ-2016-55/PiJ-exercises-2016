package D1

int i = 1
boolean finished = false
boolean prime = true 
println "Please enter a number: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
	while (!finished) {
		i++
		if (i >= n) {
			finished = true
		} else if ((n % i) == 0) {
			finished = true
			prime = false
		}
		}
if (!prime) {
	println "The number " + n + " is not Prime"
	} else {
	println "The number " + n + " is Prime"
}