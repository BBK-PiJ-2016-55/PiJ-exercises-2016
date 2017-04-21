int p1, p2
while ((p1 < 3) && (p2 < 3)) {
	println "Enter your results: "
	String s = System.console().readLine()	
		if (s == "PR" || s == "RS" || s == "SP") {
			p1++
		} else if (s == "PS" || s == "SR" || s == "RP") {
			p2++
		}
	}
if (p1 > p2) {
	println "Player 1 wins!"
	} else {
	println "Player 2 wins!"
	}