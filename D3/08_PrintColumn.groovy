// 1. Prompt user for input and assign 
println "Enter some text: "
String str = System.console().readLine()
int i = 0
int firstSpace = 0
int secondSpace 
// 2. Check each character for " " 
for (i = 0; i < str.length(); i++) {
	// 3. Print the first word
	if (str.charAt(i) == " " && firstSpace == 0) {
		secondSpace = i
		println str.substring(firstSpace,secondSpace)
		firstSpace = secondSpace
	// 4. Print any middle words without the surrounding space characters
	} else if (str.charAt(i) == " ") {
		secondSpace = i
		println str.substring((firstSpace + 1),secondSpace)
		firstSpace = secondSpace
	// 5.  Print the last word without the leading space character
	} else if (i == (str.length() - 1)) {
		secondSpace = str.length()
		println str.substring((firstSpace + 1),secondSpace)
	}
}
