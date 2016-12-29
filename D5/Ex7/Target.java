public class Target {
	private int[][][] targetZone;

	// create a 3-D array of integers of the proposed size in 3D
	// default value of each element is 0
	public Target(int size){
		this.targetZone = new int[size][size][size];
	}

	// set one random element in array to 1
	public void init(){
		int x = (int) Math.abs((targetZone.length) * Math.random());
		int y = (int) Math.abs((targetZone.length) * Math.random());
		int z = (int) Math.abs((targetZone.length) * Math.random());
		// Plane location (testing)
		System.out.println(x + ", " + y + ", " + z);
		targetZone[x][y][z] = 1;
	}

	public Result fire(int x, int y, int z){
		return Result.HIT;
	}

}