import org.junit.*;
import static org.junit.Assert.*;

public class QueueTest {
	SupermarketQueue testQueue;
	Person petra;
	
	@Before
	public void setUp(){
		testQueue = new SupermarketQueue();
		petra = new Person("Petra");
	}
		
	@Test
	public void testRetrieveEmpty() {
		assertNull(testQueue.retrieve());
	}
	
	@Test
	public void testRetrieveFirst() {
		//test first person is returned
	}
	
}
	
	