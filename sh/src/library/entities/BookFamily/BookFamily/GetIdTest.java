package library.entities.BookFamily.BookFamily;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetIdTest {
	Book instance;
	@Before
	public void setUp() throws Exception {
		instance = new Book("Author2","ITC515","565756",45);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetID() {
		int exp=45;
		int result= instance.getID();
		assertEquals(exp,result);
	}

}
