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
	public void testHighVol() {
		String str = "10";
		int hash = str.hashCode();
		int output = hu.shortHash(hash);
		int expected = 567;
		System.out.println("expected: " + expected);
		System.out.println("output: " + output);
		assertEquals(expected, output);		
	}
}