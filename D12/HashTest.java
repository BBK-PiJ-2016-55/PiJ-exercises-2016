import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {
	HashUtilities hu;
	
	@Before
	public void setUp(){
		hu = new HashUtilities();
	}
	
	@Test
	public void testHighVol() {
		int input = 10;
		int output = hu.shortHash(input);
		int expected = 567;
		assertEquals(expected, output);		
	}
}