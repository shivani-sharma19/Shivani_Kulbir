package library.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import library.entities.Book;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.ILoan;

public class GetIDTest {
    Book instance;
	/**
	 * @throws java.lang.Exception
	 */
		@Before
	public void setUp() throws Exception {
		instance =new Book("Author2","ITC515","565756",45);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		int expResult=45;
		int result=instance.getID();
		assertEquals(expResult,result);
	}

}
