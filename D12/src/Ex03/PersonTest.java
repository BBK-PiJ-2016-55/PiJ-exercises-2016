package Ex03;

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	Person pete;
	
	@Before
	public void setUp(){
		pete = new Person();
	}

	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	
	// Test to reproduce double-space bug
	/* @Test(expected = IndexOutOfBoundsException.class)
	public void testsDoubleSpace() {
		Person p = new Person();
		String input = "Dereck Robert  Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
	} */
}
