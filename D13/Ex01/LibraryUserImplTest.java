import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserImplTest {
	LibraryUser u;
	String name = "Maya"; 
	int libraryId;
	Library library;

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
	public void testRegister() {
		library = new LibraryImpl();
		libraryId = u.register(library);
		assertEquals(libraryId, 123);
	}

	@Test
	public void testGetLibrary() {
		String libName = u.getLibrary();
		assertEquals(libName, "Library Name");
	}

}