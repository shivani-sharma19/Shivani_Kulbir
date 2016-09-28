package library.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetTitleTest {
	Book instance;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance = new Book("Author2", "ITC515", "565656", 45);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetTitle() {
		String expresult = "ITC515";
		String result = instance.getTitle();
		assertEquals(expresult, result);
	}

}
