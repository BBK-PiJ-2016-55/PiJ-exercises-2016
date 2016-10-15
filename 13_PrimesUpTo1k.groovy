int number = 0
boolean prime = true
while (number < 1001) {
	number++
	count = 2
	prime = true
	while (count < number) {	
		if ((number % count) == 0) {
		prime = false
		count = number
		} else {
		count++
		}
	}
if (prime) {
	println number
}	
}
