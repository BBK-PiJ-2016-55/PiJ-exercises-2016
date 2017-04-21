package Ex04

class Point {
double x;
double y;

// Calculates the distance to another point 
double distanceTo(Point otherPoint) {
	double distance = Math.sqrt(Math.pow((this.x - otherPoint.x),2) + Math.pow((this.y - otherPoint.y),2))
	return distance
}

// Calculates distance to the origin
double distanceToOrigin() {
	Point originPoint = new Point()
	originPoint.x = 0
	originPoint.y = 0
	double distance = distanceTo(originPoint)
	return distance
}

 // Changes the coordinates of this point to the given parameters
void moveTo(double x, double y) {
	this.x = x
	this.y = y
}

// Changes the coordinates of this point to those of the given point
void moveTo(Point otherPoint){
	this.x = otherPoint.x
	this.y = otherPoint.y
}


// Returns a copy of the current point with the same coordinates`
Point clone(){
	Point clonePoint = new Point()
	clonePoint.x = this.x
	clonePoint.y = this.y
	return clonePoint
}


// Returns a copy of the current point with the coordinates * by -1
Point opposite(){
	Point oppositePoint = new Point()
	oppositePoint.x = (this.x * - 1)
	oppositePoint.y = (this.y * - 1)
	return oppositePoint
} 

}

Point firstPoint = new Point();
firstPoint.x = 4;
firstPoint.y = 7;

Point secondPoint = new Point();
secondPoint.x = 7;
secondPoint.y = -3;

double distanceBetween = firstPoint.distanceTo(secondPoint)
println "Distance between firstPoint and secondPoint is " + distanceBetween

double distanceOrigin = firstPoint.distanceToOrigin()
println "Distance between firstPoint and origin is " + distanceOrigin

firstPoint.moveTo(5, 9)
println "firstPoint.x moved to: " + firstPoint.x
println "firstPoint.y moved to: " + firstPoint.y

firstPoint.moveTo(secondPoint)
println "New value of x for firstPoint is " + firstPoint.x
println "New value of y for firstPoint is " + firstPoint.y

Point thirdPoint = new Point() 
thirdPoint = firstPoint.clone();
println "thirdPoint is a clone of firstPoint."
println "thirdPoint.x = " + thirdPoint.x
println "thirdPoint.y = " + thirdPoint.y

Point fourthPoint = new Point() 
fourthPoint = firstPoint.opposite();
println "fourthPoint is a mirror of firstPoint."
println "fourthPoint.x = " + fourthPoint.x
println "fourthPoint.y = " + fourthPoint.y