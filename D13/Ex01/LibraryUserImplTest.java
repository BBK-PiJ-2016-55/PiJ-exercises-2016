import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserImplTest {
	LibraryUser u;
	String name = "Maya"; 

	@Before
	public void setUp(){
		u = new LibraryUserImpl(name);
	}

	@Test
	public void testGetUserName() {
		String retName = u.getUserName();
		assertEquals(retName, name);
	}

	@Test
	public void testUniqueUserName() {
		LibraryUser u2 = new LibraryUserImpl("Maya");
		assertEquals(retName, name);
	}

}