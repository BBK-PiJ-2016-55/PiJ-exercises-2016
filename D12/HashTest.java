import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {
	HashUtilities hu;
	
	@Before
	public void setUp(){
		hu = new HashUtilities();
		System.out.println("made it to the end of setup");
	}
	
	@Test
	public void testHighVolMatch() {
		String strInt;
		boolean allPassed = true;
		for (int i = 0; i < 2000; i++) {
			strInt = "" + i;
			int hash = strInt.hashCode();
			int output = hu.shortHash(hash);
			int expected = Math.abs(hash % 1000);
			if (expected != output) {
				allPassed = false;
			}	
		}
	assertTrue(allPassed);	
	}
	
	@Test
	public void testHighVolRange() {
		String strInt;
		for (int i = 1; i < 2000; i++) {
			boolean allPassed = true;
			strInt = "" + i;
			int hash = strInt.hashCode();
			int output = hu.shortHash(hash);
			if (!(output > 0 && output < 1000)) {
				allPassed = false;
			}
			assertTrue(allPassed);
		}
	}
}