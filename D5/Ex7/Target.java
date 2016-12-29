public class Target {
	private int[][][] range;
	private int targetX;
	private int targetY;
	private int targetZ;

	// create a 3-D array of integers of the proposed size
	// default value of each element is 0
	public Target(int size){
		this.range = new int[size][size][size];
	}

	// set one random element in array to 1
	public void init(){
		targetX = (int) Math.abs((range.length) * Math.random());
		targetY = (int) Math.abs((range.length) * Math.random());
		targetZ = (int) Math.abs((range.length) * Math.random());
		range[targetX][targetY][targetZ] = 1;
	}

	public Result fire(int x, int y, int z){
		if (x >= range.length || y >= range.length || x >= range.length) {
			return Result.OUT_OF_RANGE;
		} else if (range[x][y][z] == 1) {
			return Result.HIT;
		} else if (x > targetX) {
			return Result.FAIL_LEFT;
		} else if (x < targetX) {
			return Result.FAIL_RIGHT;
		} else if (y > targetY) {
			return Result.FAIL_HIGH;
		} else if (y < targetY) {
			return Result.FAIL_LOW;
		} else if (z > targetZ) {
			return Result.FAIL_SHORT;
		} else {
			return Result.FAIL_LONG;
		}

	}

}