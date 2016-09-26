package library.entities.BookFamily.BookFamily;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetTitleTest {
	Book instance;
	@Before
	public void setUp() throws Exception {
		instance = new Book("Author2","ITC515","565756",45);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetTitle() {
		String i = "ITC515";
		String result= instance.getTitle();
		assertEquals(i,result);
	}

}
