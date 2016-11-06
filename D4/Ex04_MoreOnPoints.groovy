class Point {
double x;
double y;

// Calculates the distance to another point 
double distanceTo(Point otherPoint) {
	double distance = Math.sqrt(Math.pow((thisPoint.x - otherPoint.x),2) + Math.pow((thisPoint.y - otherPoint.y),2))
	return distance
}

// Calculates distance to the origin
distanceToOrigin() {
}

// Changes to coordinates of this point to the given parameters
moveTo(double x, double y) {
}

// Changes the coordinates of this point to those of the given point
moveTo(Point){
}

// Returns a copy of the current point with the same coordinates`
clone(){
}

// Returns a copy of the current point with the cooridnates * by -1
opposite(){
}

}

Point firstPoint = new Point();
firstPoint.x = 4.0;
firstPoint.y = 1.0;

Point secondPoint = new Point();
secondPoint.x = 5.0;
secondPoint.y = 2.0;

double distanceBetween = firstPoint.distanceTo(secondPoint)
println "Distance between firstPoint and secondPOint is " + distanceBetween



