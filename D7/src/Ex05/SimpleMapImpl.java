package Ex05;

public class SimpleMapImpl implements SimpleMap {
	
	private static final int MAX_SIZE = 100;
	private String[] mapArray;

	public SimpleMapImpl() {
		mapArray = new String[MAX_SIZE];
	}
	
	public void put(int key, String name) {
		if (mapArray[key] != null) {
			mapArray[key] = name;
		}

	}

	public String get(int key) {
		if (mapArray[key] != null) {
			return mapArray[key];
		} else {
			return null;
		}
	}

	public void remove(int key) {
		if (mapArray[key] != null) {
			mapArray[key] = null;
		}
	}

	public boolean isEmpty() {
		for (int i = 0; i <= MAX_SIZE; i++) {
			if (mapArray[i] != null) {
				return false;
			}
		}
		return true;
	}

}