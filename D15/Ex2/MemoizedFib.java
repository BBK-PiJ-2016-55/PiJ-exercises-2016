import java.util.HashMap;
import java.util.Map;
import java.time.Duration;
import java.time.Instant;

public class MemoizedFib {
	static Map<Long,Long> storedResults = new HashMap<>();
	
	public static void main(String[] args) {
		final int inputInt = 40;
		
		Instant start = Instant.now();
		System.out.println("Recursive: " + recFib(inputInt));
		Instant stop = Instant.now();
		System.out.println("Time for recursive fib: " + Duration.between(start, stop).toNanos());
		
		start = Instant.now();
		System.out.println("Memoized: " + memoFib(inputInt));
		stop = Instant.now();
		System.out.println("Time for memoized fib: " + Duration.between(start, stop).toNanos());
		
	}
	
	public static long recFib(long n) {
		if ((n == 1) || (n == 2)) {
        	return 1;
        } else {
			long result = recFib(n - 1) + recFib(n - 2);
			return result;
        }
	}

	public static long memoFib(long n) {
		if ((n == 1) || (n == 2)) {
        	return 1;
        } else if (storedResults.containsKey(n)) {
			return storedResults.get(n);
		} else {
			long result = memoFib(n - 1) + memoFib(n - 2);
            storedResults.put(n, result);
			return result;
		}
		}
	}