package Ex07

class Point {
  double x;
  double y;
  }
  
class Rectangle {
  Ex04.Point topLeft;
  Ex04.Point bottomRight;
  }

// Define first rectangle
println "Enter the co-ordinates of the rectangle's top left corner: " 
Ex04.Point r1TopLeftPoint = new Ex04.Point()
print "X: "
String str = System.console().readLine()
r1TopLeftPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
r1TopLeftPoint.y = Double.parseDouble(str)

println "Enter the co-ordinates of the rectangle's bottom right corner: " 
Ex04.Point r1BottomRightPoint = new Ex04.Point()
print "X: "
str = System.console().readLine()
r1BottomRightPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
r1BottomRightPoint.y = Double.parseDouble(str)

Ex05.Rectangle myFirstRectangle = new Ex05.Rectangle()
myFirstRectangle.topLeft = r1TopLeftPoint
myFirstRectangle.bottomRight = r1BottomRightPoint

// Define second rectangle
println "Enter the co-ordinates of the rectangle's top left corner: " 
Ex04.Point r2TopLeftPoint = new Ex04.Point()
print "X: "
str = System.console().readLine()
r2TopLeftPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
r2TopLeftPoint.y = Double.parseDouble(str)

println "Enter the co-ordinates of the rectangle's bottom right corner: " 
Ex04.Point r2BottomRightPoint = new Ex04.Point()
print "X: "
str = System.console().readLine()
r2BottomRightPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
r2BottomRightPoint.y = Double.parseDouble(str)

Ex05.Rectangle mySecondRectangle = new Ex05.Rectangle()
mySecondRectangle.topLeft = r2TopLeftPoint
mySecondRectangle.bottomRight = r2BottomRightPoint

println "Enter the co-ordinates of the third point: " 
Ex04.Point searchPoint = new Ex04.Point()
print "X: "
str = System.console().readLine()
searchPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
searchPoint.y = Double.parseDouble(str)

boolean insideFirstRectangle = false
boolean insideSecondRectangle = false

if ((searchPoint.x >= myFirstRectangle.topLeft.x) && (searchPoint.x <= myFirstRectangle.bottomRight.x) && (searchPoint.y <= myFirstRectangle.topLeft.y) && (searchPoint.y >= myFirstRectangle.bottomRight.y)) {
	insideFirstRectangle = true 
}	

if ((searchPoint.x >= mySecondRectangle.topLeft.x) && (searchPoint.x <= mySecondRectangle.bottomRight.x) && (searchPoint.y <= mySecondRectangle.topLeft.y) && (searchPoint.y >= mySecondRectangle.bottomRight.y)) {
	insideSecondRectangle = true 
}	

if ((insideFirstRectangle) && (insideSecondRectangle)) {
	println "The third point is inside both rectangles."
} else if ((insideFirstRectangle) && (!insideSecondRectangle)) {
	println "The third point is only inside the first rectangle."
} else if ((!insideFirstRectangle) && (insideSecondRectangle)) {
	println "The third point is only inside the second rectangle."
} else {
	println "The third point is outside both rectangles"
}















