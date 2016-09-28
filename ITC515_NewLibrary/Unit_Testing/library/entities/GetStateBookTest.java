package library.entities;

import static org.junit.Assert.*;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetStateBookTest {

	
	Book instance;
	 ILoan loan;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance =new Book("Author2","ITC515","565656",45);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetState() {
		EBookState expResult=EBookState.AVAILABLE;
		EBookState result=instance.getState();
		assertEquals(expResult,result);
		
	}

}
