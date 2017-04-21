package Ex05

class Point {
  double x;
  double y;
  }
  
class Rectangle {
  Ex04.Point topLeft;
  Ex04.Point bottomRight;
  }
  
println "Enter the co-ordinates of the rectangle's top left corner: " 
Ex04.Point topLeftPoint = new Ex04.Point()
print "X: "
String str = System.console().readLine()
topLeftPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
topLeftPoint.y = Double.parseDouble(str)

println "Enter the co-ordinates of the rectangle's bottom right corner: " 
Ex04.Point bottomRightPoint = new Ex04.Point()
print "X: "
str = System.console().readLine()
bottomRightPoint.x = Double.parseDouble(str)
print "Y: "
str = System.console().readLine()
bottomRightPoint.y = Double.parseDouble(str)

Rectangle myRectangle = new Rectangle()
myRectangle.topLeft = topLeftPoint
myRectangle.bottomRight = bottomRightPoint

double rectangleLength = (myRectangle.bottomRight.x - myRectangle.topLeft.x)
double rectangleWidth = (myRectangle.topLeft.y - myRectangle.bottomRight.y)

println "rectangleLength = " + rectangleLength
println "rectangleWidth = " + rectangleWidth
println "Perimeter of rectangle = " + ((rectangleWidth + rectangleLength)*2)
println "Area of rectangle = " + (rectangleWidth * rectangleLength)