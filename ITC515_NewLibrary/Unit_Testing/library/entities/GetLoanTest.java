/**
 * 
 */
package library.entities;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import library.interfaces.entities.ILoan;

/**
 * @author sarvanjit
 *
 */
public class GetLoanTest {
	Book instance;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		instance = new Book("Author2", "ITC515", "565756", 45);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetLoan() {
		ILoan expResult = null;
		ILoan result = instance.getLoan();
		assertEquals(expResult, result);

	}

}
