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

public class GetAuthorTest {
	Book instance;
	 
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance =new Book("Author2","ITC515","565656",45);
	}

	

	@Test
	public final void testGetAuthor() {
		String expResult="Author2";
		String result=instance.getAuthor();
		assertEquals(expResult,result);
		
	}

}
