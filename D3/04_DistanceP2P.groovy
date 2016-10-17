// Reads the X and Y coordinates of three points and then outputs which of the three are closer
class Point {
	double x;
	double y;
	double z;
}

println "Enter your x coordinate: "
String s = System.console().readLine()
double userNumber = Double.parseDouble(s)
Point point1 = new Point();
point1.x = userNumber;
println "Enter your y coordinate: "
s = System.console().readLine()
userNumber = Double.parseDouble(s)
point1.y = userNumber;
point1.z = ((point1.y - point1.x) * (point1.y - point1.x))

println "Enter your x coordinate: "
s = System.console().readLine()
userNumber = Double.parseDouble(s)
Point point2 = new Point();
point2.x = userNumber;
println "Enter your y coordinate: "
s = System.console().readLine()
userNumber = Double.parseDouble(s)
point2.y = userNumber;
point2.z = ((point2.y - point2.x) * (point2.y - point2.x))

println "Enter your x coordinate: "
s = System.console().readLine()
userNumber = Double.parseDouble(s)
Point point3 = new Point();
point3.x = userNumber;
println "Enter your y coordinate: "
s = System.console().readLine()
userNumber = Double.parseDouble(s)
point3.y = userNumber;
point3.z = ((point3.y - point3.x) * (point3.y - point3.x))
