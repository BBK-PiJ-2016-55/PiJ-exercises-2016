package Ex09

// 1. Prompt user for inputs and assign
println "Enter some text: "
String inputString = System.console().readLine()
println "Enter the character to count: "
String searchChar = System.console().readLine()
int matchCount = 0
// 2. Check each character to see if it matches searchChar 
for (int i = 0; i < inputString.length(); i++) {
	if (inputString.charAt(i) == searchChar) {
		matchCount++
	}
}
println "The letter '" + searchChar + "' occurs " + matchCount + " times."
