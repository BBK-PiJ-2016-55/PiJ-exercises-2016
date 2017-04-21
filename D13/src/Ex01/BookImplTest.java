package Ex01;

import org.junit.*;
import static org.junit.Assert.*;

public class BookImplTest {
	Book book;
	String title = "My Book";
	String author = "Ann Author";

	@Before
	public void setUp(){
		book = new BookImpl(title, author);
	}

	@Test
	public void testGetTitle() {
		String retTitle = book.getTitle();
		assertEquals(retTitle, title);
	}

	@Test
	public void testGetAuthor() {
		String retAuthor = book.getAuthor();
		assertEquals(retAuthor, author);
	}

}