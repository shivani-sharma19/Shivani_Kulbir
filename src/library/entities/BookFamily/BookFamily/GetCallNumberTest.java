package library.entities.BookFamily.BookFamily;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetCallNumberTest {
	Book instance;
	@Before
	public void setUp() throws Exception {
	 instance = new Book("Author2","ITC515","12345",35);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetCallNumber() {
		int exp=35;
		int result= instance.getID();
		assertEquals(exp,result);
	}

}
