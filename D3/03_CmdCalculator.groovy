*/Reads user input representing a mathematical operation (one of the four basic ones) with two operands, and then executes it.*/

double result
println "Enter your first number: "
String s = System.console().readLine()
double n1 = Double.parseDouble(s)
println "Enter your second number: "
s = System.console().readLine()
double n2 = Double.parseDouble(s)

println "Enter 1 to add"
println "Enter 2 to subtract"
println "Enter 3 to multiply"
println "Enter 4 to divide"
s = System.console().readLine()
Integer choice = Integer.parseInt(s)

switch (choice) {
case 1:
	result = (n1 + n2)
	println n1 + " + " + n2 + " = " + result
	break;
case 2:
	result = (n1 - n2)
	println n1 + " - " + n2 + " = " + result
	break;
case 3:
	result = (n1 * n2)
	println n1 + " * " + n2 + " = " + result
	break;
case 4:
	result = (n1 / n2)
	println n1 + " / " + n2 + " = " + result
	break;
default:
	println "This shouldn't be showing up"
	break;
}