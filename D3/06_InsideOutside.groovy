class Point {
  double x;
  double y;
  }
  
class Rectangle {
  Point topLeft;
  Point bottomRight;
  }
  
println "Enter the co-ordinates of the rectangle's top left corner: " 
Point topLeftPoint = new Point()
print "X: "
String str = System.console().readLine()
topLeftPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
topLeftPoint.y = Double.parseDouble(str)

println "Enter the co-ordinates of the rectangle's bottom right corner: " 
Point bottomRightPoint = new Point()
print "X: "
str = System.console().readLine()
bottomRightPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
bottomRightPoint.y = Double.parseDouble(str)

println "Enter the co-ordinates of the third point: " 
Point searchPoint = new Point()
print "X: "
str = System.console().readLine()
searchPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
searchPoint.y = Double.parseDouble(str)

Rectangle myRectangle = new Rectangle()
myRectangle.topLeft = topLeftPoint
myRectangle.bottomRight = bottomRightPoint

if ((searchPoint.x >= myRectangle.topLeft.x) && (searchPoint.x <= myRectangle.bottomRight.x) && (searchPoint.y <= myRectangle.topLeft.y) && (searchPoint.y >= myRectangle.bottomRight.y)) {
	println "The third point is inside the rectangle."
} else {
	println "The third point is not inside the rectangle."
}