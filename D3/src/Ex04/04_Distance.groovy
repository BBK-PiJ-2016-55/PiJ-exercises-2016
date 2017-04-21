package Ex04

class Point {
  Double x;
  Double y;
  }
print "Enter three sets of co-ordinates to calculate which points are closest together." 
Point firstPoint = new Point()
println "X: "
String str = System.console().readLine()
firstPoint.x = Double.parseDouble(str)
println "Y: "
str = System.console().readLine()
firstPoint.y = Double.parseDouble(str)

Point secondPoint = new Point()
println "X: "
str = System.console().readLine()
secondPoint.x = Double.parseDouble(str)
println "Y: "
str = System.console().readLine()
secondPoint.y = Double.parseDouble(str)

Point thirdPoint = new Point()
println "X: "
str = System.console().readLine()
thirdPoint.x = Double.parseDouble(str)
println "Y: "
str = System.console().readLine()
thirdPoint.y = Double.parseDouble(str)

double distanceOneTwo = Math.sqrt(Math.pow((firstPoint.x - secondPoint.x),2) + Math.pow((firstPoint.y - secondPoint.y),2))
double distanceOneThree = Math.sqrt(Math.pow((firstPoint.x - thirdPoint.x),2) + Math.pow((firstPoint.y - thirdPoint.y),2))
double distanceTwoThree = Math.sqrt(Math.pow((secondPoint.x - thirdPoint.x),2) + Math.pow((secondPoint.y - thirdPoint.y),2))

if ((distanceOneTwo < distanceOneThree) && (distanceOneTwo < distanceTwoThree)) {
	println "Points 1 and 2 are the closest together."
} else if ((distanceOneThree < distanceOneTwo) && (distanceOneThree < distanceTwoThree)) {
	println "Points 1 and 3 are the closest together."
} else {
	println "Points 2 and 3 are the closest together."
}