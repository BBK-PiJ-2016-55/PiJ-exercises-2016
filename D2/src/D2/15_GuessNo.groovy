int guessCount = 0
int n
println "Try to guess my number!"
int numberToGuess = Math.abs(1000 * Math.random())
while (n != numberToGuess) { 
	print "Tell me a number: "
	String s = System.console().readLine()
	n = Integer.parseInt(s)
	guessCount++
		if (n > numberToGuess) {
		println "No! My number is lower!"
		} else {
		println "No! My number is higher!"
		}
}
println "CORRECT!"
println "You needed " + guessCount + " guesses."