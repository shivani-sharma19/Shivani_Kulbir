package library.entities.BookFamily.BookFamily;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetAuthorTest {
	Book instance;
	@Before
	public void setUp() throws Exception {
		instance = new Book("Author2","ITC515","565756",45);
		
	}

	
	@Test
	public final void testGetAuthor() {
	 String exp="Author2";
		String result= instance.getAuthor();
		assertEquals(exp,result);

		
	}

}
