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

/* // Changes to coordinates of this point to the given parameters
double moveTo(double x, double y) {
}

// Changes the coordinates of this point to those of the given point
double moveTo(Point){
}

// Returns a copy of the current point with the same coordinates`
double clone(){
}

// Returns a copy of the current point with the cooridnates * by -1
double opposite(){
} */

}

Point firstPoint = new Point();
firstPoint.x =4;
firstPoint.y = 7;

Point secondPoint = new Point();
secondPoint.x = 7;
secondPoint.y = -3;

double distanceBetween = firstPoint.distanceTo(secondPoint)
println "Distance between firstPoint and secondPoint is " + distanceBetween

double distanceOrigin = firstPoint.distanceToOrigin()
println "Distance between firstPoint and origin is " + distanceOrigin

