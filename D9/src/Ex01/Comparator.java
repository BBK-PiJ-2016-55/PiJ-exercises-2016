package Ex01;

public class Comparator {
	public <T extends Comparable<T>> T getMax(T n, T m) {
	return n.compareTo(m) > 0 ? n : m;
	}
}
 