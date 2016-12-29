public class Target {
	private int[][][] targetZone;

	// creates a 3-D array of integers of the proposed size in 3D
	public Target(int size){
		this.targetZone = new int[size][size][size];
	}

	public void init(){
	// Sets all but one (random) element in matrix to 0
	// One element set to 1
	}

	public Result fire(int x, int y, int z){
		return Result.HIT;
	}

}